
package arcondicionado;

public class ArCondicionado {
    
    private final String marca;
    private final int potencia;
    private boolean ligado;
    private int temperaturaAlvo;
    private int velocidadeDoVentilador;
    private String modoFuncionamento;

    public ArCondicionado(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
        this.ligado = false;
        this.temperaturaAlvo = 0;
        setVelocidadeDoVentilador(0);
        setModoFuncionamento("Nenhum");
    }
    
    public boolean mudarTemperatura(int temperatura){
        if (isLigado() && (temperatura < 30 || temperatura  > 10)){
            this.temperaturaAlvo = temperatura;
            return true;
        } else {
            return false;
        }
    }
    
    public void ligar(){
        this.ligado = true;
        this.velocidadeDoVentilador = 500;
        this.temperaturaAlvo = 15;
        this.modoFuncionamento = "Frio";
    }
    
    public void desligar(){
        this.ligado = false;
        this.velocidadeDoVentilador = 0;
        this.temperaturaAlvo = 0;
        this.modoFuncionamento = "Nenhum";
    }

    public String getMarca() {
        return marca;
    }


    public int getPotencia() {
        return potencia;
    }


    public boolean isLigado() {
        return ligado;
    }

    public int getVelocidadeDoVentilador() {
        return velocidadeDoVentilador;
    }

    public void setVelocidadeDoVentilador(int velocidadeDoVentilador) {
        this.velocidadeDoVentilador = velocidadeDoVentilador;
    }

    public String getModoFuncionamento() {
        return modoFuncionamento;
    }

    public void setModoFuncionamento(String modoFuncionamento) {
        this.modoFuncionamento = modoFuncionamento;
    }
    
}
