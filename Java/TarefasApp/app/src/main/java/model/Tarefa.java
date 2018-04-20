package model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created by aluno on 14/03/18.
 */
@Entity
public class Tarefa {
    @Id long id;
    private String titulo;
    private String descricao;
    private String dataLimite;
    private String estado;

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, String dataLimite, String estado) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataLimite() {
        return dataLimite;
    }

    public String getEstado() {
        return estado;
    }
}
