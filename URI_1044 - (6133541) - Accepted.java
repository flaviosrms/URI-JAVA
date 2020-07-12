import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
        int vA, vB;
            vA = sc.nextInt();
            vB = sc.nextInt();
        if(vA%vB == 0 || vB%vA == 0 ) {
            System.out.println("Sao Multiplos");   
    }   
        else {
            System.out.println("Nao sao Multiplos");
      }

    }
 
}