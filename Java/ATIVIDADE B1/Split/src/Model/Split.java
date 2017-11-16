package Model;

public class Split {
    
    private String marca;
    private String potencia;
    private boolean ligado;
    private int temperaturaAlvo;
    private String velVentilador;
    private String modo;

    public Split(String marca, String potencia) {
        this.marca = marca;
        this.potencia = potencia;
        this.ligado = false;
        this.temperaturaAlvo = 0;
        this.velVentilador = "parado";
        this.modo = "desligado";
    }
    
    public void ligar(){
        this.ligado = true;
        this.temperaturaAlvo = 25;
        this.velVentilador = "Normal";
        this.modo = "Frio";
    }
    
    public void desligar(){
        this.ligado = false;
        this.temperaturaAlvo = 0;
        this.velVentilador = "parado";
        this.modo = "desligado";
    }

    public String mudarTemperatura(int valor){
        if (ligado && 18 < valor && valor < 32 ){
            this.temperaturaAlvo = valor;
            return  "Temperatura modificada";
        } else {
            return "Temperatura inválida";
        }
    }
    
    public String mudarVelocidade(String valor){
        if (ligado){
            if (valor.equals("Lento") || valor.equals("Normal") || valor.equals("Rápido")){
                this.velVentilador = valor;
                return "Velocidade modificada para: " + valor;
            }
            return "Velocidade Inválida";
        } else {
            return "Split esta desligado";
        }
    }
    
    public String mudarModo(String valor){
      if (ligado){
            if (valor.equals("Frio") || valor.equals("Ventilando")){
                this.modo = valor;
                return "Modo alterado para: " + valor;
            }
            return "Modo Inválida";
        } else {
            return "Splite esta desligado";
        }
    }
    
    public String mostra(){
        return "Marca: " + marca + "\nPotência: " + potencia + " W" +
                "\nEstado: " + ((ligado)? "Ligado" : "Desligado") +
                "\nTemperatura: " + temperaturaAlvo + "°" +
                "\nVelocidade: " + velVentilador + 
                "\nModo: " + modo;
    }
    
}
