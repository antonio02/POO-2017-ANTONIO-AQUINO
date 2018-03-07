package modelos;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

@Entity
public class Capitulo {
    @Id long id;
    private int numero;
    private String nome;
    public ToOne<Livro> livro;
    public ToMany<Comentario> comentarios;

    public Capitulo() {
    }

    public Capitulo(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }
}
