
package App;

import Model.Split;
import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) {
        //int n = Integer.parseInt(JOptionPane.showInputDialog( "entre com um número" ) );
        Split split = new Split(JOptionPane.showInputDialog("Marca") ,
                JOptionPane.showInputDialog("Potencia: "));
        while (true){
            int opcao = Integer.parseInt(JOptionPane.showInputDialog( split.mostra() +"\nEscolha uma opção\n1= Ligar\n2 = Desligar"
                    + "\n3 = Mudar Temperatura\n4 = Mudar Velocidade\n5 = Modo" ) );
        if (opcao == 1){
            split.ligar();
            JOptionPane.showMessageDialog(null, "Está Ligado");
        }
        
        else if ( opcao == 2){
            split.desligar();
            JOptionPane.showMessageDialog(null, "Está Desligado");
        }
        
        else if (opcao == 3){
            JOptionPane.showMessageDialog(null,split.mudarTemperatura(Integer.parseInt(JOptionPane.showInputDialog( "Digite a nova temperatura" ) )));
        }
        
        else if (opcao == 4) {
            JOptionPane.showMessageDialog(null,split.mudarVelocidade(JOptionPane.showInputDialog( "Lento / Normal / Rápido")));
        }
        
        else if (opcao == 5){
            JOptionPane.showMessageDialog(null,split.mudarModo(JOptionPane.showInputDialog( "Ventilando / Frio")));
        }
        
        
        
    }
    
    }}
