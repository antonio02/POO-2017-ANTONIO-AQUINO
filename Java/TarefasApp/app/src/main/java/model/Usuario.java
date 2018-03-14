package model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

/**
 * Created by aluno on 14/03/18.
 */
@Entity
public class Usuario {
    @Id long id;
    private String nomeUsuario;
    private String senha;
    public ToMany<Tarefa> tarefas;

    public Usuario() {
    }

    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public long getId() {
        return id;
    }
}
