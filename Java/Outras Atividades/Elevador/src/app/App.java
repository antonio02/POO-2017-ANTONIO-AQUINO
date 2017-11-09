package app;

import javax.swing.JOptionPane;
import model.Elevador;

public class App {
    
    public static void main(String[] args) {
        
        Elevador elevador = new Elevador(10, 5);
        String opcao = "";
        String mensagem = "";
        
        while (!opcao.equals("0")){
            
            opcao = JOptionPane.showInputDialog("subir/descer/sair/entrar");
            if (opcao.equals("subir")) {
                mensagem = elevador.subir();
            } else if (opcao.equals("descer")) {
                mensagem = elevador.descer();
            } else if (opcao.equals("sair")){
                mensagem = elevador.sair();
            } else if (opcao.equals("entrar")){
                mensagem = elevador.entrar();
            } else {
                mensagem = "nada";
            }
            
            JOptionPane.showMessageDialog(null, mensagem);

        }
        
    }
    
}
