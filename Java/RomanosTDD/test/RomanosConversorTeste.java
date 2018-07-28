/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import romanostdd.ConversorRomanos;

/**
 *
 * @author aluno
 */
public class RomanosConversorTeste {
    
    private ConversorRomanos conversor = new ConversorRomanos();
    private Map<String, Integer> letrasValidas;
    private Map<String, Integer> letrasInvalidas;
    
    @Before
    public void setup(){
        letrasValidas = new HashMap<>();
        letrasValidas.put("I", 1);
        letrasValidas.put("V", 5);
        letrasValidas.put("X", 10);
        letrasValidas.put("L", 50);
        letrasValidas.put("C", 100);
        letrasValidas.put("D", 500);
        letrasValidas.put("M", 1000);
       
    }
    
    
    @Test
    public void testa_conversao_de_uma_letra_em_romano(){
        
        for (String letraValida : letrasValidas.keySet()) {
            assertEquals(Long.valueOf(letrasValidas.get(letraValida)), Long.valueOf(conversor.converter(letraValida)));
        }
    }
    
    @Test
    public void testa_se_conversao_de_uma_letra_invalida_lanca_exception(){
        assert false;
    }
    
    @Test
    public void testa_conversao_de_todo_um_numero_valido_em_romano(){
        assert false;
    }
    
    @Test
    public void testa_conversao_de_um_numero_invalido_em_romano_com_numeros_que_nao_podem_se_repetir_lanca_exception(){
        assert false;
    }
    
    
}
