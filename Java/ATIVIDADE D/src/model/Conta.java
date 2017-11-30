package model;

public class Conta {
    
    private double saldo;
    
    public boolean sacar(double valor){
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true; 
        }
        return false;
    }
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public void atualiza(double taxa){
        this.saldo += Math.round(this.getSaldo() * taxa);
    }

    public double getSaldo() {
        return this.saldo;
    }
    
}
