
import static org.junit.Assert.*;
import org.junit.Test;
import testes.Fracao;


public class TestarFracao {
    
    @Test
    public void test_soma(){
        Fracao f1 = new Fracao(1,2);
        Fracao f2 = new Fracao(1,3);
        assertEquals(0, f1.soma(f2).compareTo(new Fracao(5, 6)));
    }
    
    @Test
    public void test_valor_real(){
        Fracao f1 = new Fracao(1,2);
        assertEquals(0.5, f1.valorReal(), 0.1);
    }
    
    @Test
    public void test_diferenca(){
        Fracao f1 = new Fracao(1,2);
        Fracao f2 = new Fracao(1,3);
        assertEquals(0, f1.diferenca(f2).compareTo(new Fracao(1, 6)));
    }
    
    @Test
    public void test_multiplicacao(){
        Fracao f1 = new Fracao(1,2);
        Fracao f2 = new Fracao(2,3);
        assertEquals(0, f1.multiplicacao(f2).compareTo(new Fracao(2, 6)));
    }
    
    @Test
    public void test_divisao(){
        Fracao f1 = new Fracao(11,7);
        Fracao f2 = new Fracao(5,9);
        assertEquals(0, f1.divisao(f2).compareTo(new Fracao(99, 35)));
    }
    
}
