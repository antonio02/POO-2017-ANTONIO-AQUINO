package usuario.app.tarefasapp;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.PopupMenu;

import java.util.Calendar;
import java.util.Locale;

import io.objectbox.Box;
import model.App;
import model.Tarefa;
import model.Usuario;

public class Tela3 extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    private EditText edtxtTitulo;
    private EditText edtxtDescricao;
    private EditText edtxtData;
    private EditText edtxtStatus;
    private Box<Usuario> usuarios;
    private Long userid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        edtxtTitulo = findViewById(R.id.tela3_edtxt_nome_tarefa);
        edtxtDescricao = findViewById(R.id.tela3_edtxt_descricao_tarefa);
        edtxtData = findViewById(R.id.tela3_edtxt_data_tarefa);
        edtxtStatus = findViewById(R.id.tela3_edtxt_status_tarefas);
        usuarios = ((App) getApplication()).getBoxStore().boxFor(Usuario.class);
        userid = getIntent().getLongExtra("userid", -1);
    }

    public void setStatus(View view) {
        PopupMenu pop = new PopupMenu(this, view);
        pop.getMenu().add("A fazer");
        pop.getMenu().add("Fazendo");
        pop.getMenu().add("Feita");
        pop.getMenu().add("Cancelada");
        pop.show();
        pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                edtxtStatus.setText(menuItem.getTitle().toString());
                return true;
            }
        });
    }

    public void setData(View view) {
        Calendar c = Calendar.getInstance();
        DatePickerDialog data = new DatePickerDialog(this,this, c.get(Calendar.YEAR),
                c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        data.show();
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        edtxtData.setText(String.format(Locale.getDefault(), "%d/%d/%d", i2,i1+1,i));
    }

    public void finalizar(View view) {
        Tarefa t = new Tarefa(edtxtTitulo.getText().toString(),
                edtxtDescricao.getText().toString(), edtxtData.getText().toString(), edtxtStatus.getText().toString());
        Usuario u = usuarios.get(userid);
        u.tarefas.add(t);
        usuarios.put(u);
        finish();
    }

    public void cancelar(View view) {
        finish();
    }
}
