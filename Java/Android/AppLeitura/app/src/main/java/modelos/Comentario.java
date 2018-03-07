package modelos;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Comentario {

    @Id long id;
    private String comentario;
    ToOne<Data> dataComentario;
    ToOne<Capitulo> capitulo;

    public Comentario() {
    }

    public Comentario(String comentario, Data dataComentario) {
        this.comentario = comentario;
        this.dataComentario.setTarget(dataComentario);
    }

    public String getComentario() {
        return comentario;
    }

    public String getDataComentario() {
        return dataComentario.getTarget().toString();
    }

    public long getId() {
        return id;
    }
}
