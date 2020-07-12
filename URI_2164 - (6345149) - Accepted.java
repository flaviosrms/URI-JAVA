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
//
double fibo;
int n = sc.nextInt();
if (n>0 && n<=50){
fibo = ((Math.pow(((1+Math.sqrt(5))/2.0),n))-(Math.pow(((1-Math.sqrt(5))/2.0),n)))/(Math.sqrt(5));
System.out.printf("%.1f\n", fibo);
}
   }
 }