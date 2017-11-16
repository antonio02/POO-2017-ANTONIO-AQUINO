package Model;

public class Circulo {
    private double raio;
    private double diametro;
    private final double PI = 3.14;
    private Ponto centro = new Ponto(0,0);

    public Circulo(double raio) {
        if (raio < 0){
            this.raio = 1;
        } else {
            this.raio = raio;
        }
        this.diametro =  2 * raio;
    }
    
    public double calCircuferencia(){
        return 2 * PI * raio;
    }
    
    public double calArea(){
        return  PI * raio * raio;
    }
    
    public void mudarCirculo(double x, double y){
        centro.mudar(x, y);
    }
    
    public void aumentaRaio(int valor){
        this.raio += valor;
        this.diametro =  2 * raio;
    }
    
    public void diminuirRaio(int valor){
        this.raio -= valor;
        this.diametro =  2 * raio;
    }
    
    public String pontoDentro(Ponto ponto){
        if (centro.distancia(ponto) <= raio){
            return "Está dentro";
        } else {
            return "está fora";
        }
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }
    
    public String distanciaCirculo(Circulo circulo){
        if (centro.distancia( circulo.getCentro() ) <  raio + circulo.getRaio() ){
            return  "Círculos Secantes";
        }
        else if (centro.distancia( circulo.getCentro() ) ==  raio + circulo.getRaio() ){
            return "Círculos Tangentes";
        }
        else{
            return "Círculos Externos";
        }
    }
    
    
}
