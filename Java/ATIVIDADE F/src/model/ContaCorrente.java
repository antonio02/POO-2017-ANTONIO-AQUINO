
package model;

public class ContaCorrente extends  Conta {
    
       @Override
    public void deposita(double valor) {
        super.deposita(valor - 0.10);
    }

    @Override
    public void atualiza(double taxa) {
        this.deposita(this.getSaldo()*taxa*2);
    }
    
    
}
