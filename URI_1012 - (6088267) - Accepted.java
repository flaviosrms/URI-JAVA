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
 
        double pi, var_a, var_b, var_c, s_triang, s_circ, s_trapz, s_quad, s_ret;
            Scanner sc = new Scanner(System.in);
            var_a = sc.nextDouble();
            var_b = sc.nextDouble();
            var_c = sc.nextDouble();
                pi = 3.14159;
                s_triang = var_a * var_c *(1/2.0);
                s_circ = pi * var_c * var_c;
                s_trapz = (var_a + var_b) * var_c * (1/2.0);
                s_quad = var_b * var_b;
                s_ret = var_a * var_b;
                    System.out.printf("TRIANGULO: %.3f\n", s_triang);
                    System.out.printf("CIRCULO: %.3f\n", s_circ);
                    System.out.printf("TRAPEZIO: %.3f\n", s_trapz);
                    System.out.printf("QUADRADO: %.3f\n", s_quad);
                    System.out.printf("RETANGULO: %.3f\n", s_ret);
 
    }
}