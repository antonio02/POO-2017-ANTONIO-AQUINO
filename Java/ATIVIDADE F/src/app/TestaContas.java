package app;

import javax.swing.JOptionPane;
import model.AtualizadorDeContas;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TestaContas {
    
    public static void main(String[] args) {
        
        Conta ca = new ContaCorrente();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        ca.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        msg(adc.roda(ca));
        msg(adc.roda(cc));
        msg(adc.roda(cp));
        msg("Saldo Total: " + adc.getSaldoTotal());
        
    }
   
    public static void msg(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
}
