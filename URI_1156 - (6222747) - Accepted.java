import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutars
 */
 //FLAVIO RAMOS - V1 
public class Main {

    public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);
float i, j=1;
float soma = 1;
for (i=3; i<=39; i=i+2){
j = j*2;
soma = soma + (i/j);
}
System.out.printf("%.2f\n",soma);  
    }
}