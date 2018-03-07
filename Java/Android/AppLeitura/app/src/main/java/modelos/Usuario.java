package modelos;

import java.util.ArrayList;
import java.util.List;
import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
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

    String getDataDeNascimento() {
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
