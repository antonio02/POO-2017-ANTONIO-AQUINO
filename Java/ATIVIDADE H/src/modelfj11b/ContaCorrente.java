
package modelfj11b;

public class ContaCorrente implements ContaTributavel {
    
    private double saldo;
    
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
        this.saldo += valor - 0.10;;
    }

    @Override
    public void atualiza(double taxa) {
        this.deposita(this.getSaldo()*taxa*2);
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo()*0.01;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
    
}
