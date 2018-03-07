package utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.antonio.appleitura.R;
import adapters.RvAdapterComentarios;
import io.objectbox.Box;
import modelos.App;
import modelos.Capitulo;


public class DialogComentarios extends DialogFragment{

    RvAdapterComentarios adapter;

    public static DialogComentarios newInstance(long idCap){
        DialogComentarios dialog = new DialogComentarios();
        Bundle b = new Bundle();
        b.putLong("idCap", idCap);
        dialog.setArguments(b);
        return dialog;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_comentarios, container);
        v.setMinimumWidth(getActivity().getWindow().getDecorView().getWidth());
        RecyclerView rv = v.findViewById(R.id.rv_dialog_comentarios);
        Box<Capitulo> capitulos = ((App) getActivity().getApplication()).getBoxStore().boxFor(Capitulo.class);
        adapter = new RvAdapterComentarios(capitulos,
                getArguments().getLong("idCap"), getActivity());
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        if (getDialog().getWindow() != null) {
            getDialog().getWindow().requestFeature(STYLE_NO_TITLE);
        }
        v.findViewById(R.id.dialog_cometarios_fab).setOnClickListener(view -> getDialog().dismiss());

        return v;
    }
}
