
package model;

public class Usuario {
    
    private String email;
    private String senha;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    public boolean logar(String senha){
        return this.senha.equals(senha);
    }
    
}
