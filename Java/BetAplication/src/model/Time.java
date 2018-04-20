package model;

public class Time {
    
    private String nome;
    private String sigla;

    public Time(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}