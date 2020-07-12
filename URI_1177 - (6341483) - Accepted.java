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
int i = 0, j = 0,k=0;
int num = sc.nextInt();
if (num>=2 && num<=50){
int n [] = new int [1000];
while (i<1000){
for(j=0; j<=num-1 && i<1000; j=j+1){
n[i] = j;
i=i+1;
}
}
for(k=0; k<1000; k=k+1){
System.out.println("N["+k+"] = "+n[k]);
}
}
   }
 }
