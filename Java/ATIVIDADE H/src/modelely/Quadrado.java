
package modelely;

public class Quadrado implements FiguraGeometrica, Comparavel {
    
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4*lado;
    }

    @Override
    public int comparar(FiguraGeometrica f) {
        if (this.calcularArea() > f.calcularArea()){
            return 1;
        } else if (this.calcularArea() == f.calcularArea()){
            return 0;
        }
        return -1;
    }
    
}
