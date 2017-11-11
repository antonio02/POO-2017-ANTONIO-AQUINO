package Model;

public class Ponto {
    
    private double x;
    private double y;
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distPontos(Ponto ponto2){
        return Math.sqrt((Math.pow((ponto2.getY()-getY()),2) + Math.pow((ponto2.getX()-getX()),2)));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
