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
double A[] = new double[100];
for (i=0; i<100; i=i+1){
double num = sc.nextDouble();
A[i] = num;
}
for(j=0; j<100; j=j+1){
if (A[j]<=10){
System.out.printf("A["+j+"] = %.1f\n",A[j]);
}  
}
//
   }
 }
