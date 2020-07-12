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
 double n1, n2, media;
  n1 = sc.nextDouble();
 while(n1<0 || n1>10){
 System.out.println("nota invalida");
 n1 = sc.nextDouble();
 }
  n2 = sc.nextDouble();
  while(n2<0 || n2>10){
 System.out.println("nota invalida");
 n2 = sc.nextDouble();
 }
 media = (n1+n2)/2;
 System.out.printf("media = %.2f\n", media);
//
}
}