package teste.mediaapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.main_edtxt_usuario);
    }

    public void entrar(View view) {
        Intent it = new Intent(this, Tela2.class);
        it.putExtra("usuario", usuario.getText().toString().trim());
        startActivity(it);
        finish();
    }
}
