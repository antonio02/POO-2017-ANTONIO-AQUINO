
package cap57Porta;

public class Casa {
    
    private String cor;
    private int totalPortas;
    private Porta portas[];

    public Casa(String cor, int totalPortas) {
        this.cor = cor;
        this.totalPortas = totalPortas;
        this.portas = new Porta[totalPortas];
    }
    
    public boolean adicionaPorta(Porta p){
        for (int i = 0; i < totalPortas; i++) {
            if (portas[i] == null){
                portas[i] = p;
                return true;
            }
        }
        return false;
    }
    
    public void abrirPorta(int indice){
        if (portas[indice]!= null){
            portas[indice].setAberta(true);
        }
    }
    
    public void fecharPorta(int indice){
        if (portas[indice]!= null){
            portas[indice].setAberta(false);
        }
    }
    
    public void pinta(String cor){
        this.cor = cor;
    }
    
    public int quantasPortasAbertas(){
        int contador = 0;
        for (int i = 0; i < totalPortas; i++) {
            if (portas[i]!= null && portas[i].isAberta()){
                contador ++;
            }
        }
        return contador;
    }

    public int getTotalPortas() {
        return totalPortas;
    }
    
}
