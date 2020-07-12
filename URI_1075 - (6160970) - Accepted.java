import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutars
 */
public class Main {


    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
   int num;
   int i = 1;
   num = sc.nextInt();
   if (num<10000){
   while(i<10000){
   if(i % num == 2) {
      System.out.println(i); 
   }
    i = i+1;
   }
}
//
    }
}
