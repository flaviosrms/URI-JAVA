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
 
        int var1, var2, PROD;  
        Scanner sc = new Scanner(System.in);
            var1 = sc.nextInt();
            var2 = sc.nextInt();
            PROD = var1 * var2;
        System.out.println("PROD = "+PROD);
 
    }
 
}