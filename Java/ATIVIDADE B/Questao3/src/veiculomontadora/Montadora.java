
package veiculomontadora;

public class Montadora {
    
    private String nome;
    private final String cnpj;

    public Montadora(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
    
    public String montadoraParaString(){
        return "Nome: "+ getNome() + "\n CNPJ: "+ cnpj;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
}
