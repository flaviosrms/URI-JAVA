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
 
        double raio, pi, area;
        pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();
        area = (raio*raio)*pi;
        System.out.printf("A=%.4f\n", area);
 
    }
 
}