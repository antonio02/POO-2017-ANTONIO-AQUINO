package modelfj11b;

public class ContaPoupanca implements Conta {
    
    private double saldo;

    @Override
    public void atualiza(double taxa) {
        this.deposita(this.getSaldo()*taxa*3);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true; 
        }
        return false;
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
    
}
