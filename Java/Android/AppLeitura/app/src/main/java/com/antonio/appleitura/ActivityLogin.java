package com.antonio.appleitura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import io.objectbox.Box;
import modelos.App;
import modelos.Logavel;
import modelos.Usuario;
import modelos.Usuario_;

public class ActivityLogin extends AppCompatActivity {

    TextView txtStatus;
    EditText edtxtUsuario;
    EditText edtxtSenha;
    CheckBox checkConectado;
    LinearLayout layoutConectado;
    Button btnLogin;
    TextView txtClickNaoCadastrado;
    Box<Logavel> logado;
    Box<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        logado = ((App) getApplication()).getBoxStore().boxFor(Logavel.class);
        checarLogado();
        usuarios = ((App) getApplication()).getBoxStore().boxFor(Usuario.class);
        bindviews();
        setupInteracoes();
    }

    public void logarConta(View view) {
        if(checarCampos()){
            List<Usuario> usuario = usuarios.query().equal(Usuario_.nomeDeUsuario,
                    edtxtUsuario.getText().toString().trim()).build().find();
            if(!usuario.isEmpty()){
                Usuario user = usuario.get(0);
                if(user.logar(edtxtSenha.getText().toString().trim())){
                    if(checkConectado.isChecked()){
                        user.setKeeplogado(true);
                    } else {
                        user.setKeeplogado(false);
                    }
                    logado.removeAll();
                    logado.put(user);
                    usuarios.put(user);
                    callInicio();
                } else {
                    txtStatus.setText(R.string.login_error_senhaIncorreta);
                }
            } else {
                txtStatus.setText(R.string.login_error_usuarioNaoEncontrado);
            }

        }

    }

    private void checarLogado() {
        if (logado.count() > 0){
            if(logado.getAll().get(0).getKeeplogado()) {
                callInicio();
            } else {
                logado.removeAll();
            }
        }
    }

    private void callInicio() {
        Intent it = new Intent(this, ActivityInicio.class);
        it.putExtra("userid", logado.getAll().get(0).getId());
        startActivity(it);
        finish();
    }

    private boolean checarCampos() {
        if(edtxtUsuario.getText().toString().trim().length() < 6){
            txtStatus.setText(R.string.cadastro_error_txtStatus_usuarioPequeno);
            return false;
        }

        if(edtxtSenha.getText().toString().trim().length() < 5){
            txtStatus.setText(R.string.cadastro_error_txtStatus_senhaPequena);
            return false;
        }
        return true;
    }

    public void abrirTelaCadastro(View view) {
        Intent it = new Intent(this, FormularioCadastro.class);
        startActivity(it);
    }

    public void setConectado(View view) {
        if(checkConectado.isChecked()){
            checkConectado.setChecked(false);
        } else {
            checkConectado.setChecked(true);
        }
    }

    private void bindviews() {
        txtStatus = findViewById(R.id.login_txt_status);
        edtxtUsuario = findViewById(R.id.login_edtxt_usuario);
        edtxtSenha = findViewById(R.id.login_edtxt_senha);
        checkConectado = findViewById(R.id.login_checkbox_conectado);
        layoutConectado = findViewById(R.id.login_clicklayout_conectado);
        btnLogin = findViewById(R.id.login_btn_login);
        txtClickNaoCadastrado = findViewById(R.id.login_clicktxt_naocadastrado);
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
                    edtxtUsuario.setText(texto);
                    return;
                }

                if (!Character.isLetterOrDigit(charSequence.charAt(i))) {
                    edtxtUsuario.setText(texto);
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
                    edtxtSenha.setText(texto);
                    return;
                }

                if (String.valueOf(charSequence.charAt(i)).equals(" ")) {
                    edtxtSenha.setText(texto);
                    edtxtSenha.clearFocus();
                    edtxtSenha.requestFocus(View.FOCUS_BACKWARD);
                }

                edtxtSenha.clearFocus();
                edtxtSenha.requestFocus(View.FOCUS_BACKWARD);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }
}
