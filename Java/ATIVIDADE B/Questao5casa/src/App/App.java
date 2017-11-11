
package App;

import Model.Circulo;
import Model.Ponto;
import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) {
        Ponto centro1 = new Ponto(1,3);
        Ponto centro2 = new Ponto(1,5);
        Circulo circulo1 = new Circulo(1, centro1);
        Circulo circulo2 = new Circulo(1, centro2);
        
        JOptionPane.showMessageDialog(null, circulo1.verificarCirculo(circulo2));
    }
}
