package veiculomontadora;

public class Veiculo {
    
    private final long numeroChassi;
    private String modelo;
    private String cor;
    private Montadora montadora;

    public Veiculo(long numeroChassi,Montadora montadora,String modelo, String cor) {
        this.numeroChassi = numeroChassi;
        this.modelo = modelo;
        this.cor = cor;
        this.montadora = montadora;
    }
    
    public String carroParaString(){
        return "Chassi: " + numeroChassi + "\n Modelo: "+ getModelo()+ "\n Cor: "+ getCor() + "\n Montadora: "+ montadora.getNome();
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public long getNumeroChassi() {
        return numeroChassi;
    }
    
    
    
}
