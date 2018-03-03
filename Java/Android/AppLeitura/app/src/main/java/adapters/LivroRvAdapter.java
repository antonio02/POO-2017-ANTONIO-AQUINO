package adapters;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.antonio.appleitura.FormularioLivro;
import com.antonio.appleitura.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import io.objectbox.Box;
import modelos.Livro;
import modelos.Usuario;
import utils.LivroDetalhesDialog;

public class LivroRvAdapter extends RecyclerView.Adapter<LivroRvAdapter.ViewHolder> implements Usuario.OnUserChangeListener{

    private List<Livro> livros = new ArrayList<>();
    private Box<Usuario> usuarios;
    private long userid;
    private String tipo;
    private FragmentManager fragManager;

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView nomeLivro;
        TextView autorLivro;
        TextView anoLivro;
        TextView statusLeitura;
        TextView statusPaginas;
        ProgressBar barra;

        ViewHolder(View itemView) {
            super(itemView);
            nomeLivro = itemView.findViewById(R.id.cv_txt_nome_livro);
            autorLivro = itemView.findViewById(R.id.cv_txt_nome_autor);
            anoLivro = itemView.findViewById(R.id.cv_txt_ano_livro);
            statusLeitura = itemView.findViewById(R.id.cv_txt_status_leitura);
            statusPaginas = itemView.findViewById(R.id.cv_txt_status_paginas);
            barra = itemView.findViewById(R.id.cv_progress_bar);
        }
    }

    public LivroRvAdapter(Box<Usuario> usuarios, long userid, String tipo, FragmentManager fragManager) {
        this.usuarios = usuarios;
        this.userid = userid;
        this.tipo = tipo;
        this.fragManager = fragManager;
        usuarios.get(userid).setOnUserChangeListener(this);
        preencherLista();
    }

    @Override
    public LivroRvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_card_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(LivroRvAdapter.ViewHolder holder, int position) {
        Livro livro = livros.get(position);
        holder.nomeLivro.setText(livro.getNome());
        holder.autorLivro.setText(livro.getAutor());
        holder.anoLivro.setText(String.valueOf(livro.getAno()));
        holder.statusPaginas.setText(String.format(Locale.getDefault(), "Páginas: %d/%d",
                livro.getPaginasLidas(),livro.getTotalPaginas()));
        holder.barra.setMax(livro.getTotalPaginas());
        holder.barra.setProgress(livro.getPaginasLidas());
        String status = livro.getStatusLeitura();
        if(status.equalsIgnoreCase("lido")){
            configTxtStatus(holder, "Lido", 0xFF65DD06, View.VISIBLE);
            holder.statusPaginas.setText(String.format(Locale.getDefault(), "Páginas: %d",
                    livro.getTotalPaginas()));
        } else if(status.equalsIgnoreCase("lendo")){
            configTxtStatus(holder, "Lendo", 0xFFFFCC00, View.VISIBLE);
        } else if(status.equalsIgnoreCase("desejo")){
            configTxtStatus(holder, "Desejo", 0xFF0000FF, View.INVISIBLE);
        } else if(status.equalsIgnoreCase("desisti")){
            configTxtStatus(holder, "Desisti", 0xFFFF2102, View.VISIBLE);
        }

        setupClicks(holder.itemView, livro, position);
    }

    private void setupClicks(View itemView, Livro livro, int pos) {
        itemView.setOnLongClickListener(view -> {
            PopupMenu popup = new PopupMenu(view.getContext(), view);
            popup.inflate(R.menu.cv_livro_options);
            popup.show();

            popup.setOnMenuItemClickListener(menuItem -> {
                switch (menuItem.getItemId()){
                    case R.id.menu_cv_livro_option_detalhes:
                        LivroDetalhesDialog detalhes = LivroDetalhesDialog.newInstance(
                                livro.getDataInicio()==null? "---":livro.getDataInicio(),
                                livro.getDataTermino()==null? "---":livro.getDataTermino(),
                                livro.getAvaliacao().equals("")? "Não avaliado":livro.getAvaliacao()
                        );
                        detalhes.setStyle(DialogFragment.STYLE_NO_TITLE, android.R.style.Theme_Holo_Light_Dialog);
                        detalhes.show(fragManager,"");
                        break;
                    case R.id.menu_cv_livro_option_editar:
                        Intent it = new Intent(itemView.getContext(), FormularioLivro.class);
                        it.putExtra("livroId", livro.getId());
                        it.putExtra("userid", userid);
                        itemView.getContext().startActivity(it);
                }
                return true;
            });
            return true;
        });
    }

    @Override
    public void onchange() {
        preencherLista();
        notifyDataSetChanged();
    }

    private void preencherLista(){
        livros.clear();
        Usuario user = usuarios.get(userid);
        if(tipo == null){
            livros.addAll(user.livros);
        } else {
            for(Livro l: user.livros){
                if(l.getStatusLeitura().equalsIgnoreCase(tipo)){
                    livros.add(l);
                }
            }
        }
    }

    private void configTxtStatus(ViewHolder t , String s, int cor, int show){
        t.statusLeitura.setText(s);
        t.statusLeitura.setTextColor(cor);
        t.statusPaginas.setVisibility(show);
    }

    @Override
    public int getItemCount() {
        return livros.size();
    }
}
