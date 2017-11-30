package model;

public class ContaPoupanca extends Conta {

    @Override
    public void deposita(double valor) {
        super.deposita(valor - 0.10);
    }

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa*3);
    }
    
}