package model;

public class ContaPoupanca extends Conta {

    @Override
    public void atualiza(double taxa) {
        this.deposita(this.getSaldo()*taxa*3);
    }
    
}
