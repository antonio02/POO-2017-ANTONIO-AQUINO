
package app;

import model.AtualizadorDeContas;
import model.Banco;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class AppBanco {
    
    public static void main(String[] args) {
    
        Banco banco = new Banco();
        AtualizadorDeContas atl = new AtualizadorDeContas(0.02);
    
        Conta ca = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        ca.deposita(1000); cc.deposita(1000); cp.deposita(1000);
        
        banco.adicionaConta(ca);
        banco.adicionaConta(cc);
        banco.adicionaConta(cp);
        
        for (int i = 0; i < banco.pegaTotalDeContas(); i++) {
            TestaContas.msg(atl.roda(banco.pegaConta(i)));
        }
    }
}
