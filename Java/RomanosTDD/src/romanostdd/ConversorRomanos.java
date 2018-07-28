
package romanostdd;


public class ConversorRomanos {
    
    public long converter(String numeroRomano){
        return converterLetra(numeroRomano.charAt(0));
    }
    
    
    public long converterLetra(char letra){
        return NumeroRomano.valueOf(Character.toString(letra).toUpperCase()).getValor();
    }
}
