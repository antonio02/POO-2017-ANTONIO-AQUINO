
package modelquestao5;

public class Diretor extends Funcionario {

    public Diretor(String nome, String cpf, int matricula, double salario) {
        super(nome, cpf, matricula, salario);
    }

    @Override
    public double getBonificacao() {
        return this.salario;
    }
    
}
