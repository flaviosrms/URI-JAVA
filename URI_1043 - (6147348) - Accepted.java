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
        float A, B, C, peri, surf;
          A = sc.nextFloat();
          B = sc.nextFloat();
          C = sc.nextFloat();
            if (A<(B+C) && B<(A+C) && C<(A+B) ){
              peri = A+B+C;
              System.out.printf("Perimetro = %.1f\n", peri);
            }
            else {
              surf = (A+B)*C/2;
              System.out.printf("Area = %.1f\n", surf);
              
            }

 
    }
 
}