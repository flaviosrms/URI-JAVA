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
 
      int cod1, cod2, n_pc1, n_pc2;
      double val_1,val_2, total;
        Scanner sc = new Scanner(System.in);
        cod1 = sc.nextInt();
        n_pc1 = sc.nextInt();
        val_1 = sc.nextDouble();
        cod2 = sc.nextInt();
        n_pc2 = sc.nextInt();
        val_2 = sc.nextDouble();
          total = (val_1 * n_pc1) + (val_2 * n_pc2);
            System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}