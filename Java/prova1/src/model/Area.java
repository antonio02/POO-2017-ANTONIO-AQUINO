
package model;

import java.util.ArrayList;
import java.util.List;

public class Area {
    
    private String nome;
    private List<Noticia> noticiasAnalise = new ArrayList<>();
    private List<Noticia> noticiasAceitas = new ArrayList<>();

    public Area(String nome) {
        this.nome = nome;
    }

    void adicionarAnalise(Noticia n) {
        noticiasAnalise.add(n);
    }

    public String getNome() {
        return nome;
    }

    public List<Noticia> getNoticiasAnalise() {
        return noticiasAnalise;
    }

    public List<Noticia> getNoticiasAceitas() {
        return noticiasAceitas;
    }
    
    

}
