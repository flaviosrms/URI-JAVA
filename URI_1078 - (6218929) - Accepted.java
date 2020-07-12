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
    int x,i, prod;
    x = sc.nextInt();
    if (x>2 && x<1000){
   for(i=1; i<=10; i=i+1){
  System.out.println(i+" x "+x+" = "+x*i);
   }
}
    }
}