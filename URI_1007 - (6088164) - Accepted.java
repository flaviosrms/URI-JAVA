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
 
        int var_a, var_b, var_c, var_d, resp;
        Scanner sc = new Scanner(System.in);
            var_a = sc.nextInt();
            var_b = sc.nextInt();
            var_c = sc.nextInt();
            var_d = sc.nextInt();
            resp = (var_a * var_b - var_c * var_d);
                System.out.println("DIFERENCA = "+resp);
 
    }
}