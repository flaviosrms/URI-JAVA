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
  double A, B, C, d, R1, R2;
  A = sc.nextDouble();
  B = sc.nextDouble();
  C = sc.nextDouble();
  d = (B*B)-(4*A*C);
   if (d>=0 && A!=0) {
      R1 = (-B+(Math.sqrt(d)))/(2*A);
      R2 = (-B-(Math.sqrt(d)))/(2*A);  
     System.out.printf("R1 = %.5f\n", R1);
     System.out.printf("R2 = %.5f\n", R2); 
   }
  else
  System.out.println("Impossivel calcular");
    }
 
}