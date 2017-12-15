
package modelquestao5;

public class Gerente extends Funcionario {
    
    private double participacaoLucro;

    public Gerente(String nome, String cpf, int matricula, double salario) {
        super(nome, cpf, matricula, salario);
    }

    @Override
    public double getBonificacao() {
        return this.salario + participacaoLucro;
    }
    
}
