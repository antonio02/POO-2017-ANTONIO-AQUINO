
package modelquestao6;

public class ContaPoupanca extends ContaCorrente {
    
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }
    
    public void render(double taxa){
        this.saldo += this.saldo * taxa;
    }
    
}
