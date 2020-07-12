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
int i;
double x, y, z,media;
i = sc.nextInt();
while (i>0){
x = sc.nextDouble();
y = sc.nextDouble();
z = sc.nextDouble();
media = (x*2.0+y*3.0+z*5.0)/10.0;
System.out.printf("%.1f\n", media);
i=i-1;  
}
    }
}