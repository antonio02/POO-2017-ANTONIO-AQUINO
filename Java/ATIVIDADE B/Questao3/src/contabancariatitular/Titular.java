
package contabancariatitular;

public class Titular {
    
    private String nome;
    private final String cpf;
    private boolean spcSerasa;

    public Titular(String nome, String cpf, boolean spcSerasa) {
        this.nome = nome;
        this.cpf = cpf;
        this.spcSerasa = spcSerasa;
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

    public boolean isSpcSerasa() {
        return spcSerasa;
    }

    public void setSpcSerasa(boolean spcSerasa) {
        this.spcSerasa = spcSerasa;
    }
    
    
    
}
