
package modelquestao6;

public abstract class Conta {
    
    private String titular;
    protected double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    
}
