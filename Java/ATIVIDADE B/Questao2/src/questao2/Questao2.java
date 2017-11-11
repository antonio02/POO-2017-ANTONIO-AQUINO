
package questao2;

public class Questao2 {

    public static void main(String[] args) {
        // Parte 1
        int sum = 0;
        int number = 1;
        
        while (number <= 100){
            sum += number;
            number++;
        }
       //Parte 2
       sum = 0;
       number = 1;
       
        do {
            sum += number;
            number++;        
        } while (sum <= 1000000);
        
    }
    
}
