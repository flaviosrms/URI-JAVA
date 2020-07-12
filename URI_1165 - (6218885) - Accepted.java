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
      int num, i=0,j=0, cont = 0;
      i = sc.nextInt();
      if (i>=1 && i<=100){
      while(i>0){
      num = sc.nextInt();
      if (num>1 && num<=10000000){
        cont = 0;
for (j=2; j<=Math.sqrt(num); j=j+1){
if (num%j == 0){
cont = cont+1;
}
}
if (cont>=1){
System.out.println(num+" nao eh primo"); 
}
else {
System.out.println(num+" eh primo");
}
      i=i-1;  
      }
      }
}
//
    }
}