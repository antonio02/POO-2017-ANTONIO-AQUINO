
package modelquestao4;

public class Triangulo extends FiguraGeometrica {
    
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.setTriangulo(ladoA, ladoB, ladoC);
    }

    @Override
    public double calcularArea() {
        //Fórmula de Heron
        double p = (ladoA + ladoB + ladoC)/2;
        return Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
    }

    @Override
    public double calcularPerimetro() {
        return ladoA+ladoB+ladoC;
    }
    
    public void setTriangulo(double ladoA, double ladoB, double ladoC){
        if (Math.abs(ladoB - ladoC) < ladoA && ladoA < ladoB + ladoC ||
            Math.abs(ladoA - ladoC) < ladoB && ladoB < ladoA + ladoC ||
            Math.abs(ladoA - ladoB) < ladoC && ladoC < ladoA + ladoB){
            
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        } else {
            this.ladoA = 1;
            this.ladoB = 1;
            this.ladoC = 1;
        }
    }
  
}
