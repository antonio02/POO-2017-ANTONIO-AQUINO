
package appely;

import modelely.*;
import modelelyb.*;

public class Teste {
    
    public static void main(String[] args) {
        Quadrado q = new Quadrado(5);
        Triagulo t = new Triagulo(5, 5, 5);
        
        System.out.println(q.comparar(t));
        
        /////////////////////////////////
        
        ContaCorrente cc = new ContaCorrente("Teste", 500);
        SeguroDeVida s = new SeguroDeVida();
        AuditoriaInterna a = new AuditoriaInterna(5);
        a.adiciona(cc);
        a.adiciona(s);
        System.out.println(a.calcularTributos());
    }
    
}
