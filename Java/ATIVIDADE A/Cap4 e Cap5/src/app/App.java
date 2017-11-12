
package app;

import javax.swing.JOptionPane;
import model.Data;
import model.Empresa;
import model.Funcionario;

public class App {
    
    public static void main(String[] args) {
        Data data = new Data(14,7,2017);
        Data data2 = new Data(14,7,2018);
        Data data3 = new Data(14,7,2019);
        
        Funcionario funs[] = new Funcionario[3];
        
        String nome;
        String departamento;
        double salario;
        String rg;
        
        for (int i = 0; i < funs.length; i++) {
            nome = JOptionPane.showInputDialog("Digite o nome "+i);
            funs[i] = new Funcionario(nome, "teste", 0, "23123", data);
        }
        
        Empresa empresa = new Empresa("Pise bem", "354-874589-874", funs);
        
        System.out.println(empresa.listarFuncionarios());
        empresa.removerFuncionario("Teste");
        System.out.println(empresa.listarFuncionarios());
    }

}
