
package romanostdd;

public enum NumeroRomano {
    
    I('I', 1, true), V('V', 5, false), X('X', 10, true), L('L', 50, false), C('C', 100, true), D('D', 500, false), M('M', 1000, true);
    
    private Character letra;
    private long valor;
    private boolean canRepeat;

    private NumeroRomano(Character letra, long valor, boolean canRepeat) {
        this.letra = letra;
        this.valor = valor;
        this.canRepeat = canRepeat;
    }

    public Character getLetra() {
        return letra;
    }

    public long getValor() {
        return valor;
    }

    public boolean canRepeat() {
        return canRepeat;
    }
}
