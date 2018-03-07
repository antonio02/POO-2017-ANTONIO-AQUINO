package utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.antonio.appleitura.R;

import java.util.Locale;


public class DialogNovoCapitulo extends DialogFragment {

    private EditText edTxtNome;
    private Button btnCancelar;
    private Button btnFinalizar;


    public static DialogNovoCapitulo newInstance(int numero){
        DialogNovoCapitulo novo = new DialogNovoCapitulo();
        Bundle b = new Bundle();
        b.putInt("numero", numero);
        novo.setArguments(b);
        return novo;
    }

    public static DialogNovoCapitulo newInstance(int numero, long id){
        DialogNovoCapitulo novo = new DialogNovoCapitulo();
        Bundle b = new Bundle();
        b.putInt("numero", numero);
        b.putLong("id", id);
        novo.setArguments(b);
        return novo;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_novo_capitulo, container);
        edTxtNome = v.findViewById(R.id.dialog_novo_capitulo_edtxtNome);
        btnCancelar = v.findViewById(R.id.dialog_novo_capitulo_btnCancelar);
        btnFinalizar = v.findViewById(R.id.dialog_novo_capitulo_btnFinalizar);
        TextView txtCapitulo = v.findViewById(R.id.dialog_novo_capitulo_txtCap);
        txtCapitulo.setText(String.format(Locale.getDefault(), "Capitulo %d", getArguments().getInt("numero")));
        if(getDialog().getWindow() != null) {
            getDialog().getWindow().requestFeature(STYLE_NO_TITLE);
            v.setMinimumWidth(getActivity().getWindow().getDecorView().getWidth());
        }
        setupClicks();
        return v;
    }

    private void setupClicks() {
        btnCancelar.setOnClickListener(view -> getDialog().dismiss());

        btnFinalizar.setOnClickListener(view -> {
            if(!edTxtNome.getText().toString().isEmpty()){
                if(getArguments().containsKey("id")){
                    ((OnNovoCapituloListener) getActivity()).capituloEditado(edTxtNome.getText().toString().trim(),
                            getArguments().getLong("id"));
                    getDialog().dismiss();
                } else {
                    ((OnNovoCapituloListener) getActivity()).novoCapituloCriado(edTxtNome.getText().toString().trim());
                    getDialog().dismiss();
                }
            } else {
                Toast.makeText(getContext(), "Nome Vazio", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public interface OnNovoCapituloListener {
        void novoCapituloCriado(String nome);
        void capituloEditado(String nome, long id);
    }
}
