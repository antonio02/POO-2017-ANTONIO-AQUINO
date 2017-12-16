package modelfj11b;

public interface Conta {
    
    boolean sacar(double valor);
    void deposita(double valor);
    void atualiza(double taxa);
    public double getSaldo();
    
}
