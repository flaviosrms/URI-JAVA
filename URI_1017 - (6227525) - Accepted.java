import java.io.IOException;
import java.util.Scanner;
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
int temp, vel;
double qntd;
temp = sc.nextInt();
vel = sc.nextInt();
qntd = (double)(temp*vel)/12;
System.out.printf("%.3f\n", qntd);
    }
}