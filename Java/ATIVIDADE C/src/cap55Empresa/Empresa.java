
package cap55Empresa;

public class Empresa {
    
    private String nome;
    private final String cnpj;
    private Funcionario funcionarios[];

    public Empresa(String nome, String cnpj, Funcionario[] funcionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = funcionarios;
    }
    
    public void adicionaFuncionario(Funcionario funcionario){ 
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = funcionario;
                return;
            }
        }
        Funcionario novaLista[] = new Funcionario[(funcionarios.length+1)];
        System.arraycopy(funcionarios, 0, novaLista, 0, funcionarios.length);
        novaLista[funcionarios.length] = funcionario;
        funcionarios = novaLista;
    }
    
    public String mostraEmpregados(){
        String texto = "";
        
        try {
            for (Funcionario f: funcionarios) {
                texto += "\n" + f.mostra();
            }
            return texto;
        } catch (Exception NullPointerException) {
            return texto;
        }
    }
    
    public void removerFuncionario(String nome){
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].getNome().equals(nome)){
                for (int j = i; j < funcionarios.length-1; j++) {
                    funcionarios[j] = funcionarios[j+1];   
                }
                funcionarios[funcionarios.length-1] = null;
                return;
            } 
        }
    }
    
    public boolean contem(Funcionario f){
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i]!= null && funcionarios[i].equals(f)) {
                return true;
            }  
        }
        return false;
    
    }
    
}
