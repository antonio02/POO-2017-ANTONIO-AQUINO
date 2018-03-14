package teste.mediaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Tela2 extends AppCompatActivity {

    public static final int TELA3_CODE = 1;
    private String usuario;
    private EditText edtxtnota1;
    private EditText edtxtnota2;
    private TextView txtStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        usuario = getIntent().getStringExtra("usuario");
        edtxtnota1 = findViewById(R.id.tela2_edtxt_nota1);
        edtxtnota2 = findViewById(R.id.tela2_edtxt_nota2s);
        txtStatus = findViewById(R.id.tela2_txt_status);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case TELA3_CODE:
                if(resultCode == RESULT_OK){
                    double media = data.getDoubleExtra("media", 0);
                    if(media >= 7){
                        txtStatus.setText(String.format(Locale.getDefault(), "Parabens %s você foi aprovado com media %.2f",
                                usuario,media));
                        txtStatus.setTextColor(0xFF00FF00);
                    } else if (media < 4){
                        txtStatus.setText(String.format(Locale.getDefault(), "Sinto muito %s você ficou reprovado. sua media: %.2f",
                                usuario,media));
                        txtStatus.setTextColor(0xFFFF0000);
                    } else {
                        txtStatus.setText(String.format(Locale.getDefault(), "%s cuidado você ficou de prova final. sua media foi %.2f " +
                                        "e você precisa obter %.2f para obter aprovação",
                                usuario,media,12-media));
                        txtStatus.setTextColor(0xFF0000FF);
                    }
                }
        }
    }

    public void calcularMedia(View view) {
        Intent it = new Intent(this, Tela3.class);
        it.putExtra("nota1", Double.valueOf(edtxtnota1.getText().toString().trim()));
        it.putExtra("nota2", Double.valueOf(edtxtnota2.getText().toString().trim()));
        startActivityForResult(it, TELA3_CODE);
    }
}
