package Model;

public class Ponto {
    private double x;
    private double y;
    
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double distancia(Ponto ponto){
        return Math.sqrt( ( ( ponto.getX()-this.x ) * ( ponto.getX()-this.x ) ) + 
                ( ( ponto.getY()-this.y ) * ( ponto.getY()-this.y ) ) );
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public void mudar(double x, double y){
        this.x = x;
        this.y = y;
    }
}
