package contabanco;

import model.Conta;

public class ContaBanco {

    public static void main(String[] args) {
        
        Conta conta = new Conta(1887,"cc","Antonio Filho");
        int[] i;
        i = new int[2];
        i[2] = 1;
        System.out.println(i[1]);
            
        conta.setStatusConta(true);
        conta.depositar(50);
        conta.setStatusConta(false);
        conta.sacar(10);
        conta.printarConta();
        
    }
    
}
