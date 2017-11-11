
package funcionariocargo;

public class Funcionario {
    
    private String nome;
    private Cargo cargo;
    private final String cpf;
    private final int matriculaEmpresa;

    public Funcionario(String nome, Cargo cargo, String cpf, int matriculaEmpresa) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.matriculaEmpresa = matriculaEmpresa;
    }
    
    public double salalarioAnual(){
        return cargo.getSalarioDoCargo() * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getMatriculaEmpresa() {
        return matriculaEmpresa;
    }
    
}
