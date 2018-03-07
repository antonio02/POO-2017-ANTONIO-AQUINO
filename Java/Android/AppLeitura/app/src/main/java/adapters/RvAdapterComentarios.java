package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import com.antonio.appleitura.ActivityCapitulos;
import com.antonio.appleitura.R;
import java.util.ArrayList;
import java.util.List;
import io.objectbox.Box;
import modelos.Capitulo;
import modelos.Comentario;


public class RvAdapterComentarios extends RecyclerView.Adapter<RvAdapterComentarios.ViewHolder> {

    private List<Comentario> comentarios = new ArrayList<>();
    private Box<Capitulo> capitulos;
    private long idCap;
    private Context contexto;

    public RvAdapterComentarios(Box<Capitulo> capitulos, long idCap, Context contexto) {
        this.capitulos = capitulos;
        this.idCap = idCap;
        this.contexto = contexto;
        preencherLista();
    }

    private void preencherLista() {
        comentarios.clear();
        comentarios.addAll(capitulos.get(idCap).comentarios);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(contexto).inflate(R.layout.rv_cv_comentario, parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Comentario coment = comentarios.get(position);
        holder.txtComentario.setText(coment.getComentario());
        holder.txtData.setText(coment.getDataComentario());
        holder.itemView.setOnLongClickListener(view -> {
            PopupMenu popup = new PopupMenu(contexto, holder.itemView);
            popup.getMenu().add(R.string.popup_comentario_excluir);
            popup.setOnMenuItemClickListener(menuItem -> {
                String s = menuItem.getTitle().toString();
                if(s.equalsIgnoreCase(holder.itemView.getResources().getString(R.string.popup_comentario_excluir))){
                    Capitulo capitulo = capitulos.get(idCap);
                    capitulo.comentarios.removeById(coment.getId());
                    capitulos.put(capitulo);
                    preencherLista();
                    ((ActivityCapitulos) contexto).atualizarRv();
                }
                return true;
            });
            popup.show();
            return true;
        });
    }

    @Override
    public int getItemCount() {
        return comentarios.size();
    }

    static class ViewHolder extends RvAdapterCapitulos.ViewHolder{
        TextView txtComentario;
        TextView txtData;

        ViewHolder(View itemView) {
            super(itemView);
            txtComentario = itemView.findViewById(R.id.rv_cv_coment_cometario);
            txtData = itemView.findViewById(R.id.rv_cv_coment_data);
        }
    }
}
