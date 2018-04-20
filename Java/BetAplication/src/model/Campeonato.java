
package model;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    
    private String nome;
    private String sigla;
    private String local;
    private List<Time> times = new ArrayList<>();
    public List<Jogo> jogos = new ArrayList<>();

    public Campeonato(String nome, String sigla, String local) {
        this.nome = nome;
        this.sigla = sigla;
        this.local = local;
    }
    
    public void gerarJogos(){
        for (int i = 0; i < times.size(); i++) {
            for (int j = i+1; j < times.size(); j++) {
                jogos.add(new Jogo(times.get(i),times.get(j)));
                jogos.add(new Jogo(times.get(j),times.get(i)));
            }
        }
    }
    
    public void addTime(Time time){
        times.add(time);
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getLocal() {
        return local;
    }
    
}
