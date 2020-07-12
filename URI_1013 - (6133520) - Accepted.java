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
    
    static int Maior (int var_a, int var_b) {
        int maior_ab = (var_a + var_b + Math.abs(var_a - var_b))/2;
            return maior_ab;
}

    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
      int v1, v2, v3;
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        v3 = sc.nextInt();
          System.out.println(Maior (Maior (v1, v2), v3)+" eh o maior");

 
    }
 
}