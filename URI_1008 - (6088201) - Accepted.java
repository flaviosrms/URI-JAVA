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
 
        int numb, hr_trab;
        double val_hr, slr;
          Scanner sc = new Scanner(System.in);
          numb = sc.nextInt();
          hr_trab = sc.nextInt();
          val_hr = sc.nextDouble();
            slr = hr_trab * val_hr;
                System.out.println("NUMBER = "+numb);
                System.out.printf("SALARY = U$ %.2f\n", slr);
 
    }
}