
package modelely;

public class Triagulo implements FiguraGeometrica, Comparavel {
    
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triagulo(double ladoA, double ladoB, double ladoC) {
        verificaTriangulo(ladoA, ladoB, ladoC);
    }
    
    public void verificaTriangulo(double ladoA, double ladoB, double ladoC){
        if (ladoA+ladoB > ladoC && ladoA+ladoC > ladoB && ladoB+ladoC > ladoA){
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        } else {
            this.ladoA = 1;
            this.ladoB = 1;
            this.ladoC = 1;
        }
    }

    @Override
    public double calcularArea() {
        double p = (ladoA+ladoB+ladoC)/2;
        return Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
    }

    @Override
    public double calcularPerimetro() {
        return ladoA+ladoB+ladoC;
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
