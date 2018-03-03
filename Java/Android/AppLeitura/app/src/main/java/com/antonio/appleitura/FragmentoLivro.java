package com.antonio.appleitura;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import adapters.LivroRvAdapter;
import modelos.App;
import modelos.Usuario;

public class FragmentoLivro extends Fragment {

    public FragmentoLivro() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentoLivro newInstance(String tipo) {
        FragmentoLivro fragment = new FragmentoLivro();
        Bundle args = new Bundle();
        args.putString("tipo", tipo);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved) {
        View v = inflater.inflate(R.layout.fragment_livro, container, false);
        RecyclerView rv = v.findViewById(R.id.fragment_rv_livros);
        LivroRvAdapter adapter = new LivroRvAdapter(
                ((App)getActivity().getApplication()).getBoxStore().boxFor(Usuario.class),
                ((Inicio) getActivity()).getUserId(), getArguments().getString("tipo"),
                getFragmentManager());
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }
}
