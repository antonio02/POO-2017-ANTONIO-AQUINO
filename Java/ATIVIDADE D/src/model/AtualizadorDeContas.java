
package model;

public class AtualizadorDeContas {
    
    private double saldoTotal;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
        this.saldoTotal = 0;
    }
    
    public String roda(Conta c){
        String temp = "";
        temp += "Saldo Anterior = " + c.getSaldo() + "\n";
        c.atualiza(selic);
        this.saldoTotal += c.getSaldo();
        temp += "Novo Saldo = " + c.getSaldo() + "\n";
        
        return temp;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
    
}
