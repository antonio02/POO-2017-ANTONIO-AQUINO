package modelos;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public abstract class Logavel {

    @Id(assignable = true) long id;
    private String nomeDeUsuario;
    private boolean keeplogado;
    private String senha;

    public Logavel() {
    }

    public Logavel(String nomeDeUsuario, String senha) {
        this.nomeDeUsuario = nomeDeUsuario;
        this.senha = senha;
        this.keeplogado = false;
    }

    String getSenha() {
        return senha;
    }

    public void setKeeplogado(Boolean keeplogado) {
        this.keeplogado = keeplogado;
    }

    public boolean getKeeplogado() {
        return keeplogado;
    }

    public boolean logar(String senha) {
        return this.senha.equals(senha);
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public Long getId(){
        return this.id;
    }

}
