
package funcionariocargo;

class Cargo {
    
    private final String nomeDoCargo;
    private double salarioDoCargo;

    public Cargo(String nomeDoCargo, double salarioDoCargo) {
        this.nomeDoCargo = nomeDoCargo;
        this.salarioDoCargo = salarioDoCargo;
    }

    public String getNomeDoCargo() {
        return nomeDoCargo;
    }

    public double getSalarioDoCargo() {
        return salarioDoCargo;
    }

    public void setSalarioDoCargo(double salarioDoCargo) {
        this.salarioDoCargo = salarioDoCargo;
    }
    
    
    
}
