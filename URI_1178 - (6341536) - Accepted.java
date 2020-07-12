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
  int i = 0, j = 0; 
  double N[]= new double[100];
  double num = sc.nextDouble();
  N[0] = num;
  for (i=1;i<100; i=i+1){
  num = num/(2.0);
  N[i] = num;
  }
  for (j=0;j<100; j=j+1){
  System.out.printf("N["+j+"] = %.4f\n", N[j]); 
  }
   }
 }