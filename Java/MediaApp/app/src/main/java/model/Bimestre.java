package model;

import java.io.Serializable;

/**
 * Created by aluno on 14/03/18.
 */

public class Bimestre implements Serializable{
    private String nome;
    private double nota1;
    private double nota2;

    public Bimestre(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia(int peso1, int peso2){
        return ((nota1*peso1)+(nota2*peso2))/(peso1 + peso2);
    }
}
