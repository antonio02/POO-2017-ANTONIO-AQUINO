package model;

public final class Conta {
    
    private int numeroConta;
    private String tipoConta;
    private String donoConta;
    private double saldoConta;
    private boolean statusConta;
    
    public Conta(int numero, String tipo,String dono){
        setNumeroConta(numero);
        setTipoConta(tipo);
        setDonoConta(dono);
        setStatusConta(false);
        
        if (tipo.equals("cc")){
            setSaldoConta(50);
   
        } else if (tipo.equals("cp")) {
            setSaldoConta(150);
            
        } else {
            setSaldoConta(0);
            
        }
        
    }
    
    public void ativarConta(){
        statusConta = true;  
    }
    
    public void desativarConta(){
        statusConta = false;  
    }
    
    public boolean depositar(double valor){
        if (statusConta && valor > 0){
            saldoConta += valor;
            return true;
            
        } else {
            return false;
            
        }
        
    }
    
    public boolean sacar(double valor){
        if (statusConta && saldoConta >= valor && valor > 0){
            saldoConta -= valor;
            return true;
                    
        } else {
            return false;
            
        }
    }
    
    public boolean pagarMensalidade(){
        return sacar(10);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
    
    public void printarConta(){
        System.out.println("Numero: "+ getNumeroConta());
        System.out.println("Tipo: "+ getTipoConta());
        System.out.println("Dono: "+ getDonoConta());
        System.out.println("Saldo: "+ getSaldoConta());
        System.out.println("Status: "+ isStatusConta());
    }
    
    
    
}
