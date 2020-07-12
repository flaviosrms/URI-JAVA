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
int i = 0, j = 0, menor, pos = 0;
int n = sc.nextInt();
if (n>1 && n<1000){
int x[] = new int[n]; 
menor = x[0];
for (i=0; i<n; i=i+1){
int num = sc.nextInt();
x[i] = num;
if (x[i]<menor){
menor = x[i];
pos = i;
}
}
System.out.println("Menor valor: "+menor+"\nPosicao: "+pos);
}
//
   }
 }
