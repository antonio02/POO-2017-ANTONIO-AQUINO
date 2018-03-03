package utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.antonio.appleitura.R;

/**
 * Created by antonio on 26/02/18.
 */

public class LivroDetalhesDialog extends DialogFragment {

    private TextView txtDataInicio;
    private TextView txtDataFim;
    private TextView txtAvaliacao;

    public static LivroDetalhesDialog newInstance(String dataIncio, String dataFim, String avaliacao) {
        Bundle args = new Bundle();
        args.putString("dataInicio", dataIncio);
        args.putString("dataFim", dataFim);
        args.putString("avaliacao", avaliacao);
        LivroDetalhesDialog livroFragment = new LivroDetalhesDialog();
        livroFragment.setArguments(args);
        return livroFragment;
    }

    @Override
    public void onResume() {
        super.onResume();
        Window window = getDialog().getWindow();
        if(window!=null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_livro_detalhes, container, false);
        txtDataInicio = v.findViewById(R.id.dialog_livro_detalhes_dataInicio);
        txtDataFim = v.findViewById(R.id.dialog_livro_detalhes_dataFim);
        txtAvaliacao = v.findViewById(R.id.dialog_livro_detalhes_avaliacao);
        txtDataInicio.setText(getArguments().getString("dataInicio"));
        txtDataFim.setText(getArguments().getString("dataFim"));
        txtAvaliacao.setText(getArguments().getString("avaliacao"));
        v.setMinimumWidth(getActivity().getWindow().getDecorView().getWidth());
        return v;
    }
}
