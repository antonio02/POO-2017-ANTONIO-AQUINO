
package cap55Empresa;

public class Funcionario {
    
    private static int inden;
    private int identificador;
    private String nome;
    private String departamento;
    private double salario;
    private final String rg;
    private Data dataAdmissao;
    private Data dataDemissao;
    private boolean contratado;

    public Funcionario(String nome, String departamento, double salario, String rg, Data data) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.rg = rg;
        this.dataAdmissao = data;
        this.contratado = true;
        identificador = inden;
        inden ++;
    }
    
    public void aumentarSalario(Double aumento){
        this.salario += (contratado)?aumento:0;
    }
    
    public double salarioAnual(){
        return this.salario*12;
    }
    
    public void demitir(Data dataDemissao){
        this.contratado = false;
        this.dataDemissao = dataDemissao;
        this.salario = 0;
        this.departamento = "Nâo esta na empresa";
    }
    
    public void recontratar(String departamento, double salario, Data data) {
        this.departamento = departamento;
        this.salario = salario;
        this.contratado = true;
        this.dataAdmissao = data;
    }
    
    public String mostra(){
        return "Nome: "+ nome + "\nDepartamento: "+ departamento +
                String.format("\nSalario: %.2f", salario)+ "\nRg: "+ rg +
                "\nData adimissão: " + dataAdmissao.dataString() +
                "\nData demissao: "+ 
                ((contratado)?"Ainda contratado":dataDemissao.dataString())+
                "\nEsta contratado: " + ((contratado)?"sim\n":"não\n");
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public String getRg() {
        return rg;
    }

    public String getDataAdmissao() {
        return dataAdmissao.dataString();
    }

    public String getDataDemissao() {
        return dataDemissao.dataString();
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getIdentificador() {
        return identificador;
    }

}
