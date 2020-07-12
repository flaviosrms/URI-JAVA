import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutars
 */
 //FLAVIO RAMOS - V1 
public class Main {

    public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);
double x1, x2, y1, y2, dist;
x1 = sc.nextFloat();
y1 = sc.nextFloat();
x2 = sc.nextFloat();
y2 = sc.nextFloat();
dist = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
System.out.printf("%.4f\n",dist);
//
    }
}