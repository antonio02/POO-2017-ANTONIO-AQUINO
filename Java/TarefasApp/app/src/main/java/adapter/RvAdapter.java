package adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

import model.Tarefa;
import usuario.app.tarefasapp.R;

/**
 * Created by aluno on 14/03/18.
 */

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {

    private List<Tarefa> tarefas;

    public RvAdapter(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_tarefa, parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Tarefa t = tarefas.get(position);
        holder.txtNome.setText(t.getTitulo());
        holder.txtDescricao.setText(t.getDescricao());
    }

    @Override
    public int getItemCount() {
        return tarefas.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtNome;
        TextView txtDescricao;

        public ViewHolder(View itemView) {
            super(itemView);
            txtNome = itemView.findViewById(R.id.cv_nome_tarefa);
            txtDescricao = itemView.findViewById(R.id.cv_descricao);
        }
    }
}
