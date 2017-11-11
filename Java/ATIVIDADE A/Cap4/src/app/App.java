
package app;

import model.Data;
import model.Funcionario;

public class App {
    
    public static void main(String[] args) {
        Data data = new Data(14,7,2017);
        Data data2 = new Data(14,7,2018);
        Data data3 = new Data(14,7,2019);
        
        Funcionario fun = new Funcionario("Antonio", "Analista", 900, "3652733", data);
        
        fun.demitir(data2);
        System.out.println(fun.funcionarioString());
        
        fun.recontratar("Limpeza", 500,data3);
        System.out.println(fun.funcionarioString());
    }
    
}
