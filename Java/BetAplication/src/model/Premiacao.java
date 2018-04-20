
package model;

import java.util.ArrayList;
import java.util.List;

public class Premiacao {
    
    private List<Bilhete> bilhetes = new ArrayList<>();
    
    public void addBilhete(Bilhete b){
        this.bilhetes.add(b);
    }
    
    public void calcularVencendor(){
        for (Bilhete bilhete : bilhetes) {
            if(!bilhete.verificar()){
                bilhetes.remove(bilhete);
            }
        }
        
        for (Bilhete bilhete : bilhetes) {
            for(Aposta aposta: bilhete.apostas){
                bilhete.addValor((aposta.getJogo().getArrecadacao()*0.8)/aposta.getJogo().getVencedores());
            }
        }
    }
    
    public List<String> retornarVencendores(){
        List<String> vencedores = new ArrayList<>();
        for (Bilhete b : bilhetes) {
            vencedores.add(b.toString());
        }
        return vencedores;
    }
}
