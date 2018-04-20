
package model;

import java.util.ArrayList;
import java.util.List;

public class Bilhete {
    
    private String nome;
    public List<Aposta> apostas = new ArrayList<>();
    private double valorGanho;

    public Bilhete(String nome) {
        this.nome = nome;
        this.valorGanho = 0;
    }
    
    public void addValor(double valor){
        this.valorGanho += valor;
    }
    
    public boolean verificar(){
        for (Aposta aposta : apostas) {
            if(aposta.getPalpite() != aposta.getJogo().getResultado()){
                return false;
            }
        }
        for (Aposta aposta : apostas) {
            aposta.getJogo().addVencendor();
        }
        return true;
    }
    
    @Override
    public String toString(){
        return nome + " / R$ " +valorGanho;
    }
}
