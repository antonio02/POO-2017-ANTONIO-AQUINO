
package modelelyb;

public class ContaCorrente extends Conta implements Tributavel {
    
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.1;
    }
    
}
