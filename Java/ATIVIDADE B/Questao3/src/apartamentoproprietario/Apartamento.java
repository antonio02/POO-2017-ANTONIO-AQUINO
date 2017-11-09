
package apartamentoproprietario;

public class Apartamento {
    
    private final int numeroApartamento;
    private final String nomeDoPredio;
    private Proprietario proprietario;
    private String corDoApartamento;
    private double taxaDeCondominio;

    public Apartamento(int numeroApartamento, String nomeDoPredio, Proprietario proprietario) {
        this.numeroApartamento = numeroApartamento;
        this.nomeDoPredio = nomeDoPredio;
        this.proprietario = proprietario;
        setCorDoApartamento("Branco");
        setTaxaDeCondominio(500);
    }

    public String getCorDoApartamento() {
        return corDoApartamento;
    }

    public void setCorDoApartamento(String corDoApartamento) {
        this.corDoApartamento = corDoApartamento;
    }

    public double getTaxaDeCondominio() {
        return taxaDeCondominio;
    }

    public void setTaxaDeCondominio(double taxaDeCondominio) {
        this.taxaDeCondominio = taxaDeCondominio;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public String getNomeDoPredio() {
        return nomeDoPredio;
    }
    
}
