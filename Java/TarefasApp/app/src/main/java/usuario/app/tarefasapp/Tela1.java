package usuario.app.tarefasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import io.objectbox.Box;
import model.App;
import model.Usuario;
import model.Usuario_;

public class Tela1 extends AppCompatActivity {

    private EditText edtxtUsuario;
    private EditText edtxtSenha;
    private Box<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        edtxtUsuario = findViewById(R.id.tela1_edtxt_usuario);
        edtxtSenha = findViewById(R.id.tela1_edtxt_senha);
        usuarios = ((App) getApplication()).getBoxStore().boxFor(Usuario.class);
    }

    public void logar(View view) {

        List<Usuario> usuer = usuarios.query().equal(Usuario_.nomeUsuario, edtxtUsuario.getText().toString().trim()).build().find();
        if(usuer.isEmpty()){
            Usuario u = new Usuario(edtxtUsuario.getText().toString().trim(),
                    edtxtSenha.getText().toString());
            Intent it = new Intent(this, Tela2.class);
            it.putExtra("userid", usuarios.put(u));
            Toast.makeText(this, "Usuario criado", Toast.LENGTH_SHORT).show();
            startActivity(it);
            finish();

        } else {
            if(usuer.get(0).getSenha().equals(edtxtSenha.getText().toString())){
                Intent it = new Intent(this, Tela2.class);
                it.putExtra("userid", usuer.get(0).getId());
                startActivity(it);
                finish();
            } else {
                Toast.makeText(this, "Senha incorreta", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
