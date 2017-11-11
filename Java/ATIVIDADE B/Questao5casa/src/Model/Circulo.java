package Model;


public class Circulo {
    
    private double raio;
    private double diametro;
    private double circunferencia;
    private double area;
    private final double PI = 3.14;
    private Ponto centro;

    public Circulo(double raio,Ponto centro) {
        this.raio = raio;
        this.diametro = 2*raio;
        this.centro = centro;
        this.circunferencia = 2*PI*raio;
        this.area = PI*raio*raio;
    }
    
    public void movimentarCirculo(double x,double y){
        this.centro.setX(x);
        this.centro.setY(y);
    }
    
    public boolean estaDentro(Ponto ponto){
        return this.centro.distPontos(ponto) <= raio;
    }
    
    public String verificarCirculo(Circulo circulo){
        if (centro.distPontos(circulo.getCentro()) == this.raio + circulo.getRaio()){
            return "Tangentes";
        } else if (centro.distPontos(circulo.getCentro()) < this.raio + circulo.getRaio()){
            return "Secantes";
        } else {
            return "Externos";
        }
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia() {
        this.circunferencia = 2*PI*raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = PI*raio*raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio < 0){
            raio = 1;
        }
        this.raio = raio;
        this.diametro = 2*raio;
        setArea();
        setCircunferencia();
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        if (diametro < 0){
            diametro = 1;
        }
        this.raio = diametro/2;
        this.diametro = diametro;
        setArea();
        setCircunferencia();
    }

    public Ponto getCentro() {
        return centro;
    }
}
