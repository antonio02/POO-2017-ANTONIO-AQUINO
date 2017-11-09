
package contabancariatitular;

public class ContaBancaria {
    
    private Titular titular;
    private final int numeroDaConta;
    private double saldo;
    private boolean contaAtivada;

    public ContaBancaria(Titular titular, int numeroDaConta) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        
        if (titular.isSpcSerasa()){
            setContaAtivada(false);
            setSaldo(0);
        } else {
            setContaAtivada(true);
            setSaldo(50);
        }
    }
    
    public boolean sacar(double valor){
        if (isContaAtivada() && (saldo >= valor)){
            setSaldo(getSaldo() - valor);
            return  true;
        } else {
            return false;
        }
    }
    
    public boolean depositar(double valor){
        if (isContaAtivada()) {
            setSaldo(getSaldo()+valor);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean ativarConta(){
        if (titular.isSpcSerasa()) {
            return false;
        } else {
            setContaAtivada(true);
            return true;
        }
    }
    
    public void desativarConta(){
        setContaAtivada(false);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isContaAtivada() {
        return contaAtivada;
    }

    public void setContaAtivada(boolean contaAtivada) {
        this.contaAtivada = contaAtivada;
    }
    
    
}
