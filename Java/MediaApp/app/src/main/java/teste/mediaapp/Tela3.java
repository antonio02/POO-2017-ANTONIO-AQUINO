package teste.mediaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import model.Bimestre;

public class Tela3 extends AppCompatActivity {

    private Bimestre usuario;
    private EditText edtxtPeso1;
    private EditText edtxtPeso2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        usuario = (Bimestre) getIntent().getSerializableExtra("bimestre");
        edtxtPeso1 = findViewById(R.id.tela3_edtxt_peso1);
        edtxtPeso2 = findViewById(R.id.tela3_edtxt_peso2);
    }

    public void calcular(View view) {
        int peso1 = Integer.valueOf(edtxtPeso1.getText().toString().trim());
        int peso2 = Integer.valueOf(edtxtPeso2.getText().toString().trim());
        getIntent().putExtra("media", usuario.calcularMedia(peso1,peso2));
        setResult(RESULT_OK,getIntent());
        finish();
    }
}
