import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
    double nb;
    nb = sc.nextDouble();
    if(nb>=0 && nb<=25){
    System.out.println("Intervalo [0,25]");  
    }
    
    else if (nb>25 && nb<=50) {
    System.out.println("Intervalo (25,50]");      
    }
    
    else if (nb>50 && nb<=75) {
    System.out.println("Intervalo (50,75]");    
    }
    
    else if (nb>75 && nb<=100) {
    System.out.println("Intervalo (75,100]");    
    }
    
    else {
    System.out.println("Fora de intervalo");
    } 
 
    }
 
}