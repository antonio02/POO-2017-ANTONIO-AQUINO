package model;

public class Elevador {
    
    private int andares;
    private int andarAtual;
    private int capacidade;
    private int qtdPessoas;

    public Elevador(int andares, int capacidade) {
        setAndares(andares);
        setCapacidade(capacidade);
        setAndarAtual(0);
        setQtdPessoas(0);
    }
    
    public String entrar(){
        if (getQtdPessoas() < getCapacidade()) {
            setQtdPessoas(getQtdPessoas() +1);
            return "Uma pessoa adicionada! ("+getQtdPessoas()+"/"+getCapacidade()+")";
        } else {
            return "Elevador com capacidade maxima! ("+getQtdPessoas()+"/"+getCapacidade()+")";
        }
    }
    
    public String sair(){
        if (getQtdPessoas() <= 0) {
            return "O elevador esta vazio! ("+getQtdPessoas()+"/"+getCapacidade()+")";
        } else {
            setQtdPessoas(getQtdPessoas()-1);
            return "Uma pessoa saiu! ("+getQtdPessoas()+"/"+getCapacidade()+")";
        }
    }
    
    public String subir(){
        if (getAndarAtual() < getAndares()) {
            setAndarAtual(getAndarAtual()+1);
            return "Subindo um andar! ("+getAndarAtual()+"/"+getAndares()+")";
        } else {
            return "Elevador já esta no ultimo andar! ("+getAndarAtual()+"/"+getAndares()+")";
        }
    }
    
    public String descer(){
        if (getAndarAtual() <= 0) {
            return "Elevador já esta no terreo! ("+getAndarAtual()+"/"+getAndares()+")";
        } else {
            setAndarAtual(getAndarAtual()-1);
            return "Descendo um andar! ("+getAndarAtual()+"/"+getAndares()+")";
        }
    }
    

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    
    
    
}
