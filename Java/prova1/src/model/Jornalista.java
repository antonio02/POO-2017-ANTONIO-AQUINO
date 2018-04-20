
package model;

import java.util.ArrayList;
import java.util.List;

public class Jornalista extends Usuario{
    
    private String nome;
    private List<Noticia> noticias = new ArrayList<>();
    
    public Jornalista(String email, String senha, String nome) {
        super(email, senha);
        this.nome = nome;
    }
    
    public void criarNoticia(String titulo, String resumo, String materia, Area area){
        noticias.add(new Noticia(titulo, materia, resumo, area));
    }
    
    public void enviarParaAnalise(Noticia n){
        n.getArea().adicionarAnalise(n);
    }
    
}
