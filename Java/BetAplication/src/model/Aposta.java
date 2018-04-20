
package model;

public class Aposta {
    
    private Jogo jogo;
    private int palpite; // 1 Casa ganha, 0 Empate, -1 Fora ganha

    public Aposta(Jogo jogo, int palpite) {
        this.jogo = jogo;
        this.palpite = palpite;
        this.jogo.addDinheiro();
    }

    public Jogo getJogo() {
        return jogo;
    }

    public int getPalpite() {
        return palpite;
    }
    
    @Override
    public String toString(){
        String palpite;
        if(this.palpite == 1){
            palpite = "Casa Ganha";
            
        } else if(this.palpite == -1){
            palpite = "Fora Ganha";
        } else {
            palpite = "Empate";
        }
        return jogo.toString() +" / " + palpite;
    }
}
