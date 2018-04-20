
package model;

import java.util.ArrayList;
import java.util.List;

public class Bilhete {
    
    public List<Aposta> apostas = new ArrayList<>();
    
    public boolean verificar(){
        for (Aposta aposta : apostas) {
            if(aposta.getPalpite() != aposta.getJogo().getResultado()){
                return false;
            }
        }
        return true;
    }
}
