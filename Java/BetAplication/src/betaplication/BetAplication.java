
package betaplication;

import java.util.Scanner;
import model.Aposta;
import model.Bilhete;
import model.Campeonato;
import model.Jogo;
import model.Premiacao;
import model.Rodada;
import model.Time;
/*
public class BetAplication {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Campeonato camp = new Campeonato("Campeonato Brasileiro", "BRA", "Brasil");
        camp.addTime(new Time("Flamengo", "FLA"));
        camp.addTime(new Time("Fluminense", "FLU"));
        camp.gerarJogos();
        Campeonato camp2 = new Campeonato("Campeonato Piauiense", "PI", "Piaui");
        camp2.addTime(new Time("River", "RIV"));
        camp2.addTime(new Time("Barras", "BAR"));
        camp2.gerarJogos();
        Rodada rodada = new Rodada();
        rodada.campeonatos.add(camp);
        rodada.campeonatos.add(camp2);
        Premiacao premiacao = new Premiacao();
        Bilhete bilhete = new Bilhete();
        premiacao.addBilhete(bilhete);
        
        int opcao = -1;
        while (true) {
            System.out.println("--------------BET-------------");
            System.out.println("1 - Apostar");
            System.out.println("2 - Ver Apostas");
            System.out.println("3 - Finalizar rodada");
            System.out.println("4 - Verificar Bilhete");
            System.out.println("0 - Sair");
            System.out.print("> ");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    if(bilhete.apostas.size() >= 5){
                        System.out.println("Você ja fez 5 apostas");
                        break;
                    }
                    Jogo jogo = selecionarJogo(rodada);
                    System.out.println("Resultados: 0 Empate, 1 Casa ganha, 2 Fora Ganha");
                    System.out.print("> ");
                    int opcao2 = entrada.nextInt();
                    bilhete.apostas.add(new Aposta(jogo, opcao2==2?-1:opcao2));
                    System.out.println("Aposta Realizada");
                    break;
                case 2:
                    for (Aposta a: bilhete.apostas) {
                        System.out.println(a.toString());
                    }
                    break;
                case 3:
                    if(bilhete.apostas.size() < 5){
                        System.out.println("Você ainda nao fez todas as apostas");
                        break;
                    }
                    if(rodada.isFinalizada()){
                        System.out.println("A rodada ja foi finalizada");
                    } else {
                        rodada.finalizarRodada();
                        System.out.println("Rodada finalizada");
                    }
                    break;
                case 4:
                    if(bilhete.apostas.size() < 5){
                        System.out.println("Você ainda nao fez todas as apostas");
                        break;
                    } 
                    
                    if(bilhete.verificar()){
                        System.out.println("Você ganhou");
                    } else {
                        System.out.println("Você perdeu");
                    }
                    
            }
            
            if(opcao == 0){
                break;
            }
        }
    }
    
    private static Jogo selecionarJogo(Rodada rodada){
        System.out.println("> Selecione um campeonato");
        for (int i = 0; i < rodada.campeonatos.size(); i++) {
            System.out.println(String.format(
                    "%d) %s", i+1,rodada.campeonatos.get(i).getNome()));
        }
        System.out.print("> ");
        try {
            Campeonato campeonato = rodada.campeonatos.get(entrada.nextInt()-1);
            System.out.println("> Selecione um jogo");
            for (int i = 0; i < campeonato.jogos.size(); i++) {
                System.out.println(String.format(
                "%d) %s", i+1,campeonato.jogos.get(i).toString()));
            }
            System.out.print("> ");
            Jogo jogo = campeonato.jogos.get(entrada.nextInt()-1);
            System.out.println("Jogo selecionado: " + jogo.toString());
            return jogo;

        } catch (Exception e) {

        }
        return null;
    }
}
*/