
package modelfj11b;

public class GerenciadorDeImpostoDeRenda {
    
    private double total;
    
    public void Adiciona(Tributavel t){
        this.total += t.calculaTributos();
    }

    public double getTotal() {
        return total;
    }
    
}
