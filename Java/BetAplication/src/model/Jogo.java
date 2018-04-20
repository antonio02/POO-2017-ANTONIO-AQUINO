
package model;

import java.util.Locale;

public class Jogo {
    
    private int resultado = 2; // 1 Casa ganha, 0 Empate, -1 Fora ganha, 2 Nao finalizado
    private Time timeCasa;
    private Time timeFora;
    private boolean finalizado;
    private double arrecadacao;
    private int vencedores;

    public Jogo(Time timeCasa, Time timeFora) {
        this.timeCasa = timeCasa;
        this.timeFora = timeFora;
        this.arrecadacao = 0;
    }

    public double getArrecadacao() {
        return arrecadacao;
    }
    
    public void addDinheiro(){
        this.arrecadacao += 1; // 1/5 valor do bilhete
    }
    
    public void addVencendor(){
        this.vencedores += 1;
    }

    public int getVencedores() {
        return vencedores;
    }
    
    
    
    public Time getTimeCasa() {
        return timeCasa;
    }

    public Time getTimeFora() {
        return timeFora;
    }

    public int getResultado() {
        return resultado;
    }

    public boolean isFinalizado() {
        return finalizado;
    }
    
    public void finalizarJogo(int resultado){
        this.finalizado = true;
        this.resultado = resultado;
    }
    
    @Override
    public String toString(){
        String result;
        if(this.resultado == 1){
            result = "Casa Ganhou";
            
        } else if(this.resultado == -1){
            result = "Fora Ganhou";
        } else if(this.resultado == 2){
            result = "Jogo nao finalizado";
        } else {
            result = "Empate";
        }
        return String.format(Locale.getDefault(), "%s X %s / %s", 
                timeCasa.getSigla(), timeFora.getSigla(), result);
    }
}
