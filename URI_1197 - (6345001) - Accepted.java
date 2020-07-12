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
//
while (sc.hasNext()){
int v = sc.nextInt();
int t = sc.nextInt();
if (v>=-100 && v<=100 && t>=0 && t<=200){
System.out.println(v*2*t);
}
}
   }
 }