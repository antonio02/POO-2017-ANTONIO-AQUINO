package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import com.antonio.appleitura.ActivityCapitulos;
import com.antonio.appleitura.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import io.objectbox.Box;
import modelos.Capitulo;
import modelos.Livro;
import utils.DialogComentarios;
import utils.DialogNovoCapitulo;
import utils.DialogNovoComentario;


public class RvAdapterCapitulos extends RecyclerView.Adapter<RvAdapterCapitulos.ViewHolder> {

    private List<Capitulo> capitulos = new ArrayList<>();
    private Box<Livro> livros;
    private long livroId;
    private Context contexto;

    public RvAdapterCapitulos(Box<Livro> livros, long livroId, Context contexto) {
        this.livros = livros;
        this.livroId = livroId;
        this.contexto = contexto;
        preencherCapitulos();
    }

    public void preencherCapitulos() {
        capitulos.clear();
        capitulos.addAll(livros.get(livroId).capitulos);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_cv_capitulos, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Capitulo cap = capitulos.get(position);
        holder.txtNome.setText(cap.getNome());
        holder.txtNumero.setText(String.format(Locale.getDefault(), "Capitulo %d",cap.getNumero()));
        setupClicks(holder, position, cap);
    }

    private void setupClicks(ViewHolder holder, int position, Capitulo cap) {
        holder.itemView.setOnLongClickListener(view -> {
            PopupMenu popup = new PopupMenu(view.getContext(), view);
            popup.getMenu().add(R.string.popup_capitulo_editar);
            popup.getMenu().add(R.string.popup_comentario_addComentario);
            if(position == capitulos.size()-1){
                popup.getMenu().add(R.string.popup_capitulo_excluir);
            }

            popup.setOnMenuItemClickListener(menuItem -> {
                String nome = menuItem.getTitle().toString();
                if(nome.equals(view.getResources().getString(R.string.popup_capitulo_editar))){
                    DialogNovoCapitulo dialog = DialogNovoCapitulo.newInstance(cap.getNumero(),cap.getId());
                    dialog.show(((ActivityCapitulos)contexto).getSupportFragmentManager(), "");

                } else if (nome.equals(view.getResources().getString(R.string.popup_capitulo_excluir))) {
                    Livro l = livros.get(livroId);
                    l.capitulos.removeById(cap.getId());
                    livros.put(l);
                    preencherCapitulos();
                } else if (nome.equals(view.getResources().getString(R.string.popup_comentario_addComentario))){
                    DialogNovoComentario dialog = DialogNovoComentario.newInstance(cap.getId());
                    dialog.show(((ActivityCapitulos)contexto).getSupportFragmentManager(), "");
                }
                return true;
            });
            popup.show();
            return true;
        });

        holder.itemView.setOnClickListener(view -> {
            if(!cap.comentarios.isEmpty()) {
                DialogComentarios dialog = DialogComentarios.newInstance(cap.getId());
                dialog.show(((ActivityCapitulos) contexto).getSupportFragmentManager(), "");
            } else {
                Toast.makeText(contexto, "Esse capitulo não tem comentarios", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return capitulos.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtNome;
        TextView txtNumero;

        ViewHolder(View itemView) {
            super(itemView);
            txtNumero = itemView.findViewById(R.id.rv_cv_cap_numero);
            txtNome = itemView.findViewById(R.id.rv_cv_cap_nome);
        }
    }
}
