
package circulo;

public class Circulo {
    
    private double raio;
    private double diametro;
    private final double PI = 3.14;

    public Circulo(double raio, double diametro) {
        if (raio < 0){
            this.raio = 1;
        }
        this.raio = raio;
        this.diametro = diametro;
    }
    
    public double circunferencia(){
        return 2*PI*raio;
    }
    
    public double area(){
        return PI*raio*raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    
}
