package usuario.app.tarefasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

import adapter.RvAdapter;
import io.objectbox.Box;
import model.App;
import model.Tarefa;
import model.Usuario;

public class Tela2 extends AppCompatActivity {

    private RecyclerView rv;
    private Box<Usuario> usuarios;
    private long userid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        usuarios = ((App) getApplication()).getBoxStore().boxFor(Usuario.class);
        userid = getIntent().getLongExtra("userid", -1);
        rv = findViewById(R.id.tela2_rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onResume() {
        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.addAll(usuarios.get(userid).tarefas);
        rv.setAdapter(new RvAdapter(tarefas));
        super.onResume();
    }

    public void novaTarefa(View view) {
        Intent intent = new Intent(this, Tela3.class);
        intent.putExtra("userid", userid);
        startActivity(intent);
    }
}
