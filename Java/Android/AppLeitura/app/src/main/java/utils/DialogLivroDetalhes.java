package utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.antonio.appleitura.R;

public class DialogLivroDetalhes extends DialogFragment {

    public static DialogLivroDetalhes newInstance(String dataIncio, String dataFim, String avaliacao) {
        Bundle args = new Bundle();
        args.putString("dataInicio", dataIncio);
        args.putString("dataFim", dataFim);
        args.putString("avaliacao", avaliacao);
        DialogLivroDetalhes livroFragment = new DialogLivroDetalhes();
        livroFragment.setArguments(args);
        return livroFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_livro_detalhes, container, false);
        TextView txtDataInicio = v.findViewById(R.id.dialog_livro_detalhes_dataInicio);
        TextView txtDataFim = v.findViewById(R.id.dialog_livro_detalhes_dataFim);
        TextView txtAvaliacao = v.findViewById(R.id.dialog_livro_detalhes_avaliacao);
        txtDataInicio.setText(getArguments().getString("dataInicio"));
        txtDataFim.setText(getArguments().getString("dataFim"));
        txtAvaliacao.setText(getArguments().getString("avaliacao"));
        v.setMinimumWidth(getActivity().getWindow().getDecorView().getWidth());
        return v;
    }
}
