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
int n[] = new int[10];
int i = 0, j = 0;
int num = sc.nextInt();
n[0] = num; 
if (num<=50){
for(i=1; i<=9; i=i+1){
num = num*2;
n[i] = num;
}
//
for(j=0; j<=9; j=j+1){
System.out.println("N["+j+"] = "+n[j]);
}
//
}
//
   }
 }
