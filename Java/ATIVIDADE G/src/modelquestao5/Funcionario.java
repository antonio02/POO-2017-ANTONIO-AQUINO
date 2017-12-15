
package modelquestao5;

public abstract class Funcionario {
    
    private String nome;
    private String cpf;
    private int matricula;
    protected double salario;

    public Funcionario(String nome, String cpf, int matricula, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.salario = salario;
    }
    
    public abstract double getBonificacao();
    
}
