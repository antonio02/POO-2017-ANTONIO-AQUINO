package com.antonio.appleitura;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.NumberPicker;

import adapters.FragAdapterLivro;
import io.objectbox.Box;
import modelos.App;
import modelos.Logavel;
import modelos.Usuario;

public class ActivityInicio extends AppCompatActivity implements NumberPicker.OnValueChangeListener{

    Box<Logavel> logado;
    Box<Usuario> usuarios;
    private long userId;
    Toolbar toolbar;
    TabLayout tabs;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        biding();

    }

    private void biding() {
        logado = ((App) getApplication()).getBoxStore().boxFor(Logavel.class);
        userId = getIntent().getLongExtra("userid", -1);
        usuarios = ((App) getApplication()).getBoxStore().boxFor(Usuario.class);
        usuarios.get(userId).deslogar();
        toolbar = findViewById(R.id.inicio_toolbar);
        toolbar.setTitle("Meus Livros");
        setSupportActionBar(toolbar);
        tabs = findViewById(R.id.inicio_tablayout);
        viewPager = findViewById(R.id.inicio_viewpager);
        FragAdapterLivro adapter = new FragAdapterLivro(getSupportFragmentManager());
        adapter.addTab("Todos");
        adapter.addTab("Lidos");
        adapter.addTab("Lendo");
        adapter.addTab("Desejo");
        adapter.addTab("Desisti");
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuinlfado = getMenuInflater();
        menuinlfado.inflate(R.menu.actionbar_options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_actionbar_logout:
                logado.removeAll();
                Usuario user = usuarios.get(userId);
                user.setKeeplogado(false);
                usuarios.put(user);
                Intent itLogin = new Intent(this, ActivityLogin.class);
                startActivity(itLogin);
                finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        if(!logado.getAll().isEmpty() && !logado.get(userId).getKeeplogado()){
            logado.removeAll();
        }
        super.onDestroy();
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i1) {

    }

    public long getUserId(){
        return userId;
    }

    public void novoLivro(View view) {
        Intent it = new Intent(this, FormularioLivro.class);
        it.putExtra("userid", userId);
        startActivity(it);
    }
}
