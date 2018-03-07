package com.antonio.appleitura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.Calendar;

import adapters.RvAdapterCapitulos;
import io.objectbox.Box;
import modelos.App;
import modelos.Capitulo;
import modelos.Comentario;
import modelos.Data;
import modelos.Livro;
import utils.DialogNovoCapitulo;
import utils.DialogNovoComentario;

public class ActivityCapitulos extends AppCompatActivity implements DialogNovoCapitulo.OnNovoCapituloListener, DialogNovoComentario.OnNovoComentarioListener{

    private Box<Livro> livros;
    private long livroId;
    private RecyclerView rv;
    private RvAdapterCapitulos adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitulos);
        biding();
    }

    private void biding() {
        Toolbar toolbar = findViewById(R.id.capitulos_toolbar);
        toolbar.setTitle("Capitulos");
        setSupportActionBar(toolbar);
        livroId = getIntent().getLongExtra("idLivro", -1);
        livros = ((App) getApplication()).getBoxStore().boxFor(Livro.class);
        rv = findViewById(R.id.capitulos_rv);
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter = new RvAdapterCapitulos(livros, livroId, this);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    public void novoCapitulo(View view) {
        DialogNovoCapitulo cap = DialogNovoCapitulo.newInstance(livros.get(livroId).capitulos.size()+1);
        cap.show(getSupportFragmentManager(), "novoCap");
    }

    @Override
    public void novoCapituloCriado(String nome) {
        Livro livro = livros.get(livroId);
        Capitulo c = new Capitulo(livro.capitulos.size()+1, nome);
        livro.capitulos.add(c);
        livros.put(livro);
        adapter.preencherCapitulos();
    }

    @Override
    public void capituloEditado(String nome, long id) {
        Livro livro = livros.get(livroId);
        Capitulo c = livro.capitulos.getById(id);
        c.setNome(nome);
        ((App) getApplication()).getBoxStore().boxFor(Capitulo.class).put(c);
        adapter.preencherCapitulos();
    }

    @Override
    public void onNovoComentario(String s, long idCap) {
        Capitulo c = livros.get(livroId).capitulos.getById(idCap);
        Calendar atual = Calendar.getInstance();
        Data data = new Data(atual.get(Calendar.DAY_OF_MONTH),
                atual.get(Calendar.MONTH)+1, atual.get(Calendar.YEAR));
        Comentario novo = new Comentario(s, data);
        c.comentarios.add(novo);
        ((App) getApplication()).getBoxStore().boxFor(Capitulo.class).put(c);
        adapter.preencherCapitulos();
    }

    public void atualizarRv(){
        adapter.preencherCapitulos();
    }
}
