
package model;

public class Banco {
    
    private Conta contas[];
    private int ultimo;

    public Banco() {
        contas = new Conta[10];
        ultimo = 0;
    }
    
    public Banco(Conta contas[]){
        this.contas = new Conta[contas.length + 10];
        ultimo = contas.length;
    }
    
    public void adicionaConta(Conta c){
        if (ultimo == contas.length){
            Conta newcontas[] = new Conta[contas.length + 10];
            System.arraycopy(contas, 0, newcontas, 0, contas.length);
            contas[ultimo] = c;
            ultimo++;
        } else {
            contas[ultimo] = c;
            ultimo++;
        }
    }
    
    public Conta pegaConta(int index){
        return contas[index];
    }
    
    public int pegaTotalDeContas(){
        return ultimo;
    }
    
}
