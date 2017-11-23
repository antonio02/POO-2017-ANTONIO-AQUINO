
package cap57Porta;

public class Porta {
    
    private String cor;
    private String material;
    private boolean aberta;

    public Porta(String cor, String material) {
        this.cor = cor;
        this.material = material;
        this.aberta = false;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    
    
}
