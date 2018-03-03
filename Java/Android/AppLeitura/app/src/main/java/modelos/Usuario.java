package modelos;

import android.database.DataSetObservable;

import java.util.ArrayList;
import java.util.List;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Convert;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Transient;
import io.objectbox.converter.PropertyConverter;
import io.objectbox.reactive.DataObserver;
import io.objectbox.relation.ToMany;


@Entity
public class Usuario extends Logavel{

    private String nome;
    private String dataDeNascimento;
    @Backlink public ToMany<Livro> livros;
    private static List<OnUserChangeListener> listener = new ArrayList<>();
    public Usuario() {
    }

    public Usuario(String nomeDeUsuario, String nome, String senha, String dataDeNascimento) {
        super(nomeDeUsuario,senha);
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void notifyChange(){
        for(OnUserChangeListener o: listener){
            o.onchange();
        }
    }

    public void setOnUserChangeListener(OnUserChangeListener chage){
        listener.add(chage);
    }

    public interface OnUserChangeListener{
        void onchange();
    }

    public void deslogar(){
        listener.clear();
    }

}
