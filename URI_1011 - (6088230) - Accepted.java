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
 
        float raio;
        double pi, vol_esf;
          Scanner sc = new Scanner(System.in);
          raio = sc.nextFloat();
            pi = 3.14159;
            vol_esf = (4/3.0)*pi*raio*raio*raio;
                System.out.printf("VOLUME = %.3f\n", vol_esf);
 
    }
}