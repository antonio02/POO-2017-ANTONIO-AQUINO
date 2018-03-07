package utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import com.antonio.appleitura.R;

public class DialogNovoComentario extends DialogFragment{

    EditText edTxtComentario;

    public static DialogNovoComentario newInstance(long idCap){
        DialogNovoComentario dialog = new DialogNovoComentario();
        Bundle b = new Bundle();
        b.putLong("idCap", idCap);
        dialog.setArguments(b);
        return dialog;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_novo_comentario, container);
        edTxtComentario = v.findViewById(R.id.dialog_newComment_edtxt_comentario);
        setupClicks(v);
        if(getDialog().getWindow() != null) {
            getDialog().getWindow().requestFeature(STYLE_NO_TITLE);
            v.setMinimumWidth(getActivity().getWindow().getDecorView().getWidth());
        }
        return v;
    }

    private void setupClicks(View v) {
        v.findViewById(R.id.dialog_newComment_btn_finalizar).setOnClickListener(view -> {
            if(!edTxtComentario.getText().toString().trim().isEmpty()) {
                ((OnNovoComentarioListener) getActivity()).onNovoComentario(edTxtComentario.getText().toString().trim(),
                        getArguments().getLong("idCap"));
                getDialog().dismiss();
            } else {
                Toast.makeText(getContext(),"Comentario vazio",Toast.LENGTH_SHORT).show();
            }
        });

        v.findViewById(R.id.dialog_newComment_btn_cancelar).setOnClickListener(view -> getDialog().dismiss());
    }

    public interface OnNovoComentarioListener{
        void onNovoComentario(String s, long idCap);
    }
}
