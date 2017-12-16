
package modelfj11;

public class Retangulo implements AreaCalculavel {
    
    private double largura;
    private double altura;

    public Retangulo(double ladoA, double ladoB) {
        this.largura = ladoA;
        this.altura = ladoB;
    }

    @Override
    public double calcularArea() {
        return largura*altura;
    }  
}
