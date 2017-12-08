package model;

abstract public class Conta {
    
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
    
    abstract public void atualiza(double taxa);

    public double getSaldo() {
        return this.saldo;
    }
    
}
