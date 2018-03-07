package com.antonio.appleitura;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.PopupMenu;
import android.widget.TextView;
import java.util.Calendar;
import java.util.List;
import io.objectbox.Box;
import modelos.App;
import modelos.Data;
import modelos.Livro;
import modelos.Usuario;
import utils.DialogNumberPicker;

public class FormularioLivro extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, NumberPicker.OnValueChangeListener {

    private Box<Usuario> usuarios;
    private Box<Livro> livros;
    private long userid;
    private TextView txtStatus;
    private EditText edtxtNomeLivro;
    private EditText edtxtAutorLivro;
    private EditText edtxtAnoLivro;
    private EditText edtxtInicioLeitura;
    private EditText edtxtFimLeitura;
    private EditText edtxtAvaliacao;
    private EditText edtxtstatusLeitura;
    private EditText edtxtPaginasLidas;
    private EditText edtxtTotalPaginas;
    private Livro livro = new Livro();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livro_formulario);
        binding();
        setupInteracoes();
        verificarEdicao();
    }

    private void verificarEdicao() {
        if (getIntent().hasExtra("livroId")){
            livro = usuarios.get(userid).livros.getById(getIntent().getLongExtra("livroId", -1));
            edtxtNomeLivro.setText(livro.getNome());
            edtxtAutorLivro.setText(livro.getAutor());
            edtxtAnoLivro.setText(String.valueOf(livro.getAno()));
            setCenterText(edtxtInicioLeitura, livro.getDataInicio()==null? "":livro.getDataInicio());
            setCenterText(edtxtFimLeitura, livro.getDataTermino()==null? "":livro.getDataTermino());
            setCenterText(edtxtAvaliacao, livro.getAvaliacao());
            setCenterText(edtxtstatusLeitura, livro.getStatusLeitura());
            setCenterText(edtxtPaginasLidas, String.valueOf(livro.getPaginasLidas()));
            setCenterText(edtxtTotalPaginas, String.valueOf(livro.getTotalPaginas()));
        }
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        Data data = new Data(i2,i1+1,i);
        if(getTagString(datePicker).equals("datainicio")){
            if(livro.setDataInicio(data)){
                clearStatus();
                setCenterText(edtxtInicioLeitura, data.toString());
            } else {
                txtStatus.setText(livro.getErrors());
                livro.setDataInicio(null);
                limparTexto(edtxtInicioLeitura);
            }
        }

        if (getTagString(datePicker).equals("datatermino")){
            if(livro.setDataTermino(data)){
                clearStatus();
                setCenterText(edtxtFimLeitura, data.toString());
                if(!getEdTxtString(edtxtTotalPaginas).isEmpty()){
                    setCenterText(edtxtPaginasLidas, getEdTxtString(edtxtTotalPaginas));
                }
            } else {
                txtStatus.setText(livro.getErrors());
                livro.setDataTermino(null);
                limparTexto(edtxtFimLeitura);
            }
        }
        limparTexto(edtxtstatusLeitura);
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i1) {
        if (getTagString(numberPicker).equals("anolivro")) {
            setCenterText(edtxtAnoLivro, String.valueOf(i1));
            if(!getEdTxtString(edtxtInicioLeitura).isEmpty() &&
                    Integer.valueOf(getEdTxtString(edtxtInicioLeitura).substring(6,10)) < i1){
                clearDataInicio(edtxtInicioLeitura);
            }

        } else if (getTagString(numberPicker).equals("paginaslidas")){
            setCenterText(edtxtPaginasLidas, String.valueOf(i1));

        } else if (getTagString(numberPicker).equals("totalpaginas")){
            if(!getEdTxtString(edtxtFimLeitura).isEmpty()){
                setCenterText(edtxtTotalPaginas, String.valueOf(i1));
                setCenterText(edtxtPaginasLidas, String.valueOf(i1));
                return;
            }
            setCenterText(edtxtTotalPaginas, String.valueOf(i1));
        }
    }

    private void binding() {
        usuarios = ((App)getApplication()).getBoxStore().boxFor(Usuario.class);
        livros = ((App)getApplication()).getBoxStore().boxFor(Livro.class);
        userid = getIntent().getLongExtra("userid", -1);
        txtStatus = findViewById(R.id.livroForm_txt_status);
        edtxtNomeLivro = findViewById(R.id.livroForm_edtxt_nome);
        edtxtAutorLivro = findViewById(R.id.livroForm_edtxt_autor);
        edtxtAnoLivro = findViewById(R.id.livroForm_edtxt_ano);
        edtxtInicioLeitura = findViewById(R.id.livroForm_edtxt_data_inicio);
        edtxtFimLeitura = findViewById(R.id.livroForm_edtxt_data_termino);
        edtxtAvaliacao = findViewById(R.id.livroForm_edtxt_avaliacao);
        edtxtstatusLeitura = findViewById(R.id.livroForm_edtxt_statusLeitura);
        edtxtPaginasLidas = findViewById(R.id.livroForm_edtxt_paginasLidas);
        edtxtTotalPaginas = findViewById(R.id.livroForm_edtxt_totalPaginas);
    }

    private void setupInteracoes() {
        edtxtNomeLivro.addTextChangedListener(new TextWatcher() {
            String texto;
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                texto = String.valueOf(charSequence);
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(charSequence.length() < texto.length()){
                    return;
                }

                if(charSequence.length() > 50){
                    txtStatus.setText(R.string.livro_nome_grande);
                    edtxtNomeLivro.setText(texto);
                    return;
                }
                clearStatus();

            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        edtxtAutorLivro.addTextChangedListener(new TextWatcher() {
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
                    edtxtAutorLivro.setText(texto);
                    return;
                }

                if (string.length() > 0 && !(texto.length() > string.length())) {
                    if (string.contains("  ")) {
                        txtStatus.setText(R.string.cadastro_error_txtStatus_muitos_espacos);
                        edtxtAutorLivro.setText(texto);
                        edtxtAutorLivro.clearFocus();
                        edtxtAutorLivro.requestFocus(View.FOCUS_BACKWARD);
                        return;
                    }

                    if (String.valueOf(string.charAt(i)).equals(" ") ||
                            String.valueOf(string.charAt(string.length() - 1)).equals(" ")) {
                        clearStatus();
                        return;

                    } else if (!Character.isLetter(string.charAt(i)) ||
                            !Character.isLetter(string.charAt(string.length() - 1))) {
                        txtStatus.setText(R.string.cadastro_error_txtStatus_nome_apenasLetras);
                        edtxtAutorLivro.setText(texto.trim());
                        edtxtAutorLivro.clearFocus();
                        edtxtAutorLivro.requestFocus(View.FOCUS_BACKWARD);
                        return;
                    }
                    clearStatus();
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    public void getDataInicio(View view) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2000);
        if(!getEdTxtString(edtxtAnoLivro).isEmpty()){
            c.set(Calendar.YEAR, Integer.valueOf(getEdTxtString(edtxtAnoLivro)));
            c.set(Calendar.MONTH, 0);
            c.set(Calendar.DAY_OF_MONTH, 1);
        }
        criarDateDialog("datainicio", c.getTimeInMillis());
    }

    public void getDataTermino(View view) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2000);
        if(!getEdTxtString(edtxtAnoLivro).isEmpty()){
            c.set(Calendar.YEAR, Integer.valueOf(getEdTxtString(edtxtAnoLivro)));
            c.set(Calendar.MONTH, 0);
            c.set(Calendar.DAY_OF_MONTH, 1);
        }
        criarDateDialog("datatermino", c.getTimeInMillis());
    }

    public void getAnoPublicacao(View view) {
        showNumberDialog(Calendar.getInstance().get(Calendar.YEAR), 1000,
                getEdTxtString(edtxtAnoLivro).isEmpty()? 2000:
                        Integer.valueOf(getEdTxtString(edtxtAnoLivro)),"anolivro");
    }

    public void getPaginasLidas(View view) {

        if(getEdTxtString(edtxtInicioLeitura).isEmpty()){
            txtStatus.setText(R.string.livro_leitura_nao_iniciada);
            return;
        }

        if(!getEdTxtString(edtxtTotalPaginas).isEmpty()){
            if(getEdTxtString(edtxtFimLeitura).isEmpty()) {
                showNumberDialog(getEdTxtString(edtxtFimLeitura).isEmpty() ?
                                Integer.valueOf(getEdTxtString(edtxtTotalPaginas)) - 1 :
                                Integer.valueOf(getEdTxtString(edtxtTotalPaginas)),
                        0,
                        getEdTxtString(edtxtPaginasLidas).isEmpty() ? 0 :
                                Integer.valueOf(getEdTxtString(edtxtPaginasLidas)),
                        "paginaslidas");
                clearStatus();
            } else {
                txtStatus.setText(R.string.livro_jaLido);
                setCenterText(edtxtPaginasLidas, getEdTxtString(edtxtTotalPaginas));
            }

        } else {
            txtStatus.setText(R.string.livro_paginas_vazio);
        }
    }

    public void getTotalPaginas(View view) {
        showNumberDialog(5000, 5,
                getEdTxtString(edtxtTotalPaginas).isEmpty()? 5:Integer.valueOf(getEdTxtString(edtxtTotalPaginas)),
                "totalpaginas");
        limparTexto(edtxtPaginasLidas);
        clearStatus();
    }

    public void popupAvaliacao(View view) {
        PopupMenu popup = new PopupMenu(view.getContext(), edtxtAvaliacao);
        popup.getMenu().add("Amei");
        popup.getMenu().add("Gostei");
        popup.getMenu().add("Não Gostei");
        popup.getMenu().add("Muito curto");
        popup.getMenu().add("Muito longo");
        popup.getMenu().add("Chato");
        popup.getMenu().add("Sem graça");
        popup.setOnMenuItemClickListener(menuItem -> {
            edtxtAvaliacao.setText(menuItem.getTitle());
            edtxtAvaliacao.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            return false;
        });
        popup.show();
    }

    public void popupStatusLeitura(View view) {
        PopupMenu popup = new PopupMenu(view.getContext(), edtxtAvaliacao);
        List<String> itens = livro.getPossiblesStatus();
        for(String s: itens){
            popup.getMenu().add(s);
        }
        popup.setOnMenuItemClickListener(menuItem -> {
            edtxtstatusLeitura.setText(menuItem.getTitle());
            edtxtstatusLeitura.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            return false;
        });
        popup.show();
    }

    public void clearDataInicio(View view) {
        if(!edtxtInicioLeitura.getText().toString().trim().isEmpty()) {
            limparTexto(edtxtInicioLeitura);
            livro.setDataInicio(null);
            limparTexto(edtxtFimLeitura);
            livro.setDataTermino(null);
            limparTexto(edtxtstatusLeitura);
            limparTexto(edtxtPaginasLidas);
        }
    }

    public void clearDataTermino(View view) {
        if(!edtxtFimLeitura.getText().toString().trim().isEmpty()) {
            limparTexto(edtxtFimLeitura);
            livro.setDataTermino(null);
            limparTexto(edtxtstatusLeitura);
            if(getEdTxtString(edtxtPaginasLidas).equals(getEdTxtString(edtxtTotalPaginas))) {
                limparTexto(edtxtPaginasLidas);
            }
        }
    }

    private void showNumberDialog(int i, int i1, int i2, String tag) {
        DialogNumberPicker num = DialogNumberPicker.newInstance(i,i1,i2,tag);
        num.setStyle(DialogFragment.STYLE_NO_TITLE, android.R.style.Theme_Material_Dialog);
        num.show(getFragmentManager(), "");
    }

    private void criarDateDialog(String s, long minDate) {
        DatePickerDialog data = new DatePickerDialog(this, R.style.DateDialogTheme,
                this, Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        data.getDatePicker().setTag(s);
        data.getDatePicker().setMaxDate(System.currentTimeMillis());
        data.getDatePicker().setMinDate(minDate);
        data.show();
    }

    private void limparTexto(EditText e) {
        e.setText("");
        e.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_START);
    }

    @NonNull
    private String getTagString(View v) {
        return v.getTag().toString().trim();
    }

    @NonNull
    private String getEdTxtString(EditText e){
        return e.getText().toString().trim();
    }

    private void clearStatus(){
        txtStatus.setText("");
    }

    private void setCenterText(EditText e, String s){
        e.setText(s);
        e.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
    }

    public void finalizar(View view) {
        if(checarCampos()) {
            Usuario user = usuarios.get(userid);
            if (livro.getNome()==null) {
                if (checarLivroJaCadastrado(user)){
                    return;
                }

            } else if (!livro.getNome().equalsIgnoreCase(edtxtNomeLivro.getText().toString())) {
                if(checarLivroJaCadastrado(user)){
                    return;
                }
            }
            livro.preencherLivro(getEdTxtString(edtxtNomeLivro),
                    getEdTxtString(edtxtAutorLivro),
                    Integer.valueOf(getEdTxtString(edtxtAnoLivro)),
                    Integer.valueOf(getEdTxtString(edtxtTotalPaginas)),
                    getEdTxtString(edtxtPaginasLidas).isEmpty() ? 0 : Integer.valueOf(getEdTxtString(edtxtPaginasLidas)),
                    getEdTxtString(edtxtAvaliacao).isEmpty() ? "" : getEdTxtString(edtxtAvaliacao),
                    getEdTxtString(edtxtstatusLeitura));

            user.livros.add(livro);
            usuarios.put(user);
            livros.put(livro);
            user.notifyChange();
            finish();
        }
    }

    private boolean checarLivroJaCadastrado(Usuario user) {
        for (Livro l : user.livros) {
            if (l.getNome().equalsIgnoreCase(edtxtNomeLivro.getText().toString().trim())) {
                txtStatus.setText(R.string.error_livro_jaExiste);
                return true;
            }
        }
        return false;
    }

    private boolean checarCampos() {
        if(getEdTxtString(edtxtNomeLivro).length() < 3){
            txtStatus.setText(R.string.erro_livro_nome_curto);
            return false;
        }

        if(getEdTxtString(edtxtAutorLivro).length() < 4){
            txtStatus.setText(R.string.erro_livro_autor_curto);
            return false;
        }

        if(getEdTxtString(edtxtAnoLivro).isEmpty()){
            txtStatus.setText(R.string.erro_livro_ano_vazio);
            return false;
        }

        if(getEdTxtString(edtxtstatusLeitura).isEmpty()){
            txtStatus.setText(R.string.erro_livro_status_vazio);
            return false;
        }

        if(getEdTxtString(edtxtTotalPaginas).isEmpty()){
            txtStatus.setText(R.string.erro_livro_paginas_total_vazio);
            return false;
        }
        return true;
    }

    public void cancelar(View view) {
        finish();
    }
}
