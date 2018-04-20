
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rodada {
    
    public List<Campeonato> campeonatos = new ArrayList<>();
    private boolean finalizada;

    public Rodada() {
        this.finalizada = false;
    }
    
    public void finalizarRodada(){
        campeonatos.forEach((c) -> {
            c.jogos.forEach((j) -> {
                j.finalizarJogo(new Random().nextInt(3)-1);
            });
        });
        this.finalizada = true;
    }

    public boolean isFinalizada() {
        return this.finalizada;
    }
    
}
