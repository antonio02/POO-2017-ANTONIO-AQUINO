
package model;

public class ContaCorrente extends  Conta {
    
       @Override
    public void deposita(double valor) {
        super.deposita(valor - 0.10);
    }

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa * 2);
    }
    
    
}
