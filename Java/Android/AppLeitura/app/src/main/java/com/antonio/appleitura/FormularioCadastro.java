package com.antonio.appleitura;
import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import io.objectbox.Box;
import io.objectbox.query.QueryBuilder;
import modelos.App;
import modelos.Usuario;
import modelos.Usuario_;

public class FormularioCadastro extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    TextView txtStatus;
    EditText edtxtUsuario;
    EditText edtxtNome;
    EditText edtxtSenha;
    EditText edtxtConfirmarSenha;
    EditText edtxtDataNascimento;
    Box<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        usuarios = ((App) getApplication()).getBoxStore().boxFor(Usuario.class);
        bindViews();
        setupInteracoes();
    }

    private void bindViews() {
        edtxtNome = findViewById(R.id.cadastro_edtxt_nome);
        edtxtUsuario = findViewById(R.id.cadastro_edtxt_usuario);
        edtxtSenha = findViewById(R.id.cadastro_edtxt_senha);
        edtxtConfirmarSenha = findViewById(R.id.cadastro_edtxt_confirmar_senha);
        edtxtDataNascimento = findViewById(R.id.cadastro_edtxt_data_Nascimento);
        txtStatus = findViewById(R.id.cadastro_txt_status);
    }

    public void setDataDeNascimento(View view) {
        DatePickerDialog data = new DatePickerDialog(this, R.style.DateDialogTheme,
                this, Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, c.get(Calendar.YEAR)-3);
        data.getDatePicker().setMaxDate(c.getTimeInMillis());
        c.set(Calendar.YEAR, 1900);
        data.getDatePicker().setMinDate(c.getTimeInMillis());
        data.show();
    }

    @Override
    public void onDateSet(android.widget.DatePicker datePicker, int i, int i1, int i2) {
        edtxtDataNascimento.setTextAlignment(EditText.TEXT_ALIGNMENT_CENTER);
        edtxtDataNascimento.setTextSize(25);
        i1++;
        String mes;
        String dia;
        dia = (i2 < 10)? ("0"+i2) : (""+i2);
        mes = (i1 < 10)? ("0"+i1) : (""+i1);

        edtxtDataNascimento.setText(String.format(Locale.getDefault(), "%s/%s/%d", dia,mes,i));
    }

    public void cadastrar(View view) {

        if(checarCampos()) {
            String nomeUsuario = edtxtUsuario.getText().toString().trim();
            String nome = edtxtNome.getText().toString().trim();
            String senha = edtxtSenha.getText().toString().trim();
            String dataNascimento = edtxtDataNascimento.getText().toString().trim();
            List<Usuario> procurar = usuarios.query().equal(Usuario_.nomeDeUsuario, nomeUsuario, QueryBuilder.StringOrder.CASE_INSENSITIVE).build().find();
            if(procurar.isEmpty()) {
                Usuario u = new Usuario(nomeUsuario, nome, senha, dataNascimento);
                usuarios.put(u);
                finish();
            } else {
                txtStatus.setText(R.string.cadastro_error_txtStatus_usuarioJaCadastrado);
            }
        }
    }

    private boolean checarCampos() {
        if(edtxtUsuario.getText().toString().trim().length() < 6){
            txtStatus.setText(R.string.cadastro_error_txtStatus_usuarioPequeno);
            edtxtUsuario.requestFocus();
            return false;
        }

        if(edtxtNome.getText().toString().trim().length() < 8){
            txtStatus.setText(R.string.cadastro_error_txtStatus_nomePequeno);
            edtxtNome.requestFocus();
            return false;
        }

        if(edtxtSenha.getText().toString().trim().length() < 5){
            txtStatus.setText(R.string.cadastro_error_txtStatus_senhaPequena);
            edtxtSenha.requestFocus();
            return false;
        }

        if((!edtxtSenha.getText().toString().equals(edtxtConfirmarSenha.getText().toString()))){
            txtStatus.setText(R.string.cadastro_error_txtStatus_senhasDiferentes);
            edtxtConfirmarSenha.requestFocus();
            return false;
        }

        if(edtxtDataNascimento.getText().toString().trim().isEmpty()){
            txtStatus.setText(R.string.cadastro_error_txtStatus_semDataNascimento);
            return false;
        }
        Calendar c = Calendar.getInstance();
        int ano = c.get(Calendar.YEAR);
        int anopick = Integer.valueOf(edtxtDataNascimento.getText().toString().substring(6,10));

        if(ano - anopick < 3){
            txtStatus.setText(R.string.cadastro_error_txtstatus_dataMuitoNovo);
            return false;
        }

        return true;

    }

    public void cancelar(View view) {
        finish();
    }

    private void setupInteracoes() {

        edtxtUsuario.addTextChangedListener(new TextWatcher() {
            String texto;
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                texto = String.valueOf(charSequence);
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(texto.length() > charSequence.length()){
                    return;
                }

                if(charSequence.length() > 20){
                    txtStatus.setText(R.string.cadastro_error_txtStatus_nomeUsuarioGrande);
                    edtxtUsuario.setText(texto);
                    return;
                }

                if (!Character.isLetterOrDigit(charSequence.charAt(i))) {
                    txtStatus.setText(R.string.cadastro_error_txtStatus_apenasLetrasNumeros);
                    edtxtUsuario.setText(texto);
                } else {
                    txtStatus.setText("");
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        edtxtNome.addTextChangedListener(new TextWatcher() {
            String texto;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                texto = String.valueOf(charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String string = charSequence.toString();
                if(charSequence.length() > 35){
                    txtStatus.setText(R.string.cadastro_error_txtStatus_nome_grande);
                    edtxtNome.setText(texto);
                    return;
                }

                if (string.length() > 0 && !(texto.length() > string.length())) {
                    if (string.contains("  ")) {
                        txtStatus.setText(R.string.cadastro_error_txtStatus_muitos_espacos);
                        edtxtNome.setText(texto);
                        edtxtNome.clearFocus();
                        edtxtNome.requestFocus(View.FOCUS_BACKWARD);
                        return;
                    }

                    if (String.valueOf(string.charAt(i)).equals(" ") ||
                            String.valueOf(string.charAt(string.length() - 1)).equals(" ")) {
                        txtStatus.setText("");
                        return;

                    } else if (!Character.isLetter(string.charAt(i)) ||
                            !Character.isLetter(string.charAt(string.length() - 1))) {
                        txtStatus.setText(R.string.cadastro_error_txtStatus_nome_apenasLetras);
                        edtxtNome.setText(texto.trim());
                        edtxtNome.clearFocus();
                        edtxtNome.requestFocus(View.FOCUS_BACKWARD);
                        return;
                    }
                    txtStatus.setText("");
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        edtxtSenha.addTextChangedListener(new TextWatcher() {
            String texto;
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                texto = String.valueOf(charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(texto.length() > charSequence.length()){
                    return;
                }

                if(charSequence.length() > 16){
                    txtStatus.setText(R.string.cadastro_error_txtStatus_senha_grande);
                    edtxtSenha.setText(texto);
                    return;
                }

                if (String.valueOf(charSequence.charAt(i)).equals(" ")) {
                    txtStatus.setText(R.string.cadastro_error_txtStatus_espaco_senha);
                    edtxtSenha.setText(texto);
                    edtxtSenha.clearFocus();
                    edtxtSenha.requestFocus(View.FOCUS_BACKWARD);
                } else {
                    txtStatus.setText("");
                }

                edtxtSenha.clearFocus();
                edtxtSenha.requestFocus(View.FOCUS_BACKWARD);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        edtxtConfirmarSenha.addTextChangedListener(new TextWatcher() {
            String texto;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                texto = String.valueOf(charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (texto.length() > charSequence.length()) {
                    return;
                }

                if(charSequence.length() > 16){
                    txtStatus.setText(R.string.cadastro_error_txtStatus_senha_grande);
                    edtxtConfirmarSenha.setText(texto);
                    return;
                }

                if (String.valueOf(charSequence.charAt(i)).equals(" ")) {
                    txtStatus.setText(R.string.cadastro_error_txtStatus_espaco_senha);
                    edtxtConfirmarSenha.setText(texto);
                } else {
                    txtStatus.setText("");
                }

                edtxtConfirmarSenha.clearFocus();
                edtxtConfirmarSenha.requestFocus(View.FOCUS_BACKWARD);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }
}
