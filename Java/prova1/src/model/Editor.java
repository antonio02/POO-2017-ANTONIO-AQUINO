/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Editor extends Usuario{
    
    private String nome;
    private Area area;
    private boolean ischefe;

    public Editor(String nome, Area area, String email, String senha) {
        super(email, senha);
        this.nome = nome;
        this.area = area;
    }
    
    public void validarNoticia(int pos){
        area.getNoticiasAceitas().add(area.getNoticiasAnalise().get(pos));
    }
    
}
