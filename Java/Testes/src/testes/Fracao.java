
package testes;

public class Fracao implements Comparable<Fracao>{
    
    private double num;
    private double den;                                                                                                                                                   
    
    public Fracao(double num, double den){
        this.num = num;
        this.den = den;
    }
    
    public double valorReal(){
        return num / den;
    }
    
    public Fracao soma(Fracao f){
        double den2 = this.den * f.getDen();
        double num2 = ((den2 / this.den) * this.num) + ((den2 / f.getDen()) * f.getNum());
        return new Fracao(num2, den2);
    }
    
    public Fracao diferenca(Fracao f){
        double den2 = this.den * f.getDen();
        double num2 = ((den2 / this.den) * this.num) - ((den2 / f.getDen()) * f.getNum());
        return new Fracao(num2, den2);
    }
    
    public Fracao multiplicacao(Fracao f){
        return new Fracao(this.num * f.getNum(), this.den * f.getDen());
    }
    
    public Fracao divisao(Fracao f){
        return new Fracao(this.num * f.getDen(), this.den * f.getNum());
    }
    
    public Fracao reduzida(){
        
    }

    public double getNum() {
        return num;
    }

    public double getDen() {
        return den;
    }
    
    public boolean espelhada(Fracao f){
        return this.num == f.getNum() && this.den == f.getDen();
    }

    @Override
    public int compareTo(Fracao t) {
        if(this.valorReal() == t.valorReal()){
            return 0;
        } else if(this.valorReal() > t.valorReal()){
            return 1;
        } else {
            return -1;
        }
    }
    
}
