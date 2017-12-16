
package modelelyb;

public class AuditoriaInterna {
    
    private Tributavel lista[];
    private int ultimo = 0;

    public AuditoriaInterna(int tamanho) {
        this.lista = new Tributavel[tamanho];
    }
    
    public void adiciona(Tributavel t){
        this.lista[ultimo] = t;
        ultimo++;
    }
    
    public double calcularTributos(){
        double total = 0;
        
        for (int i = 0; i < ultimo; i++) {
            total += lista[i].calculaTributos();
        }
        return total;
    }
    
    
}
