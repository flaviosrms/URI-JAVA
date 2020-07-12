import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {


    public static void main(String[] args) throws IOException {
 
      Scanner sc = new Scanner(System.in);
        int num;
         num = sc.nextInt();
         DDD(num);
      }
  static void DDD(int x){

   if (x == 61){
      System.out.println("Brasilia");
   }
   else if (x == 71){
      System.out.println("Salvador"); 
   }
   else if (x == 11){
      System.out.println("Sao Paulo");  
   }
   else if (x == 21){
      System.out.println("Rio de Janeiro");
   }
   else if (x == 32){
      System.out.println("Juiz de Fora");       
   }
   else if (x == 19){
      System.out.println("Campinas");       
   }
   else if (x == 27){
      System.out.println("Vitoria");     
   }
   else if (x == 31){
      System.out.println("Belo Horizonte");
   }
   else {
     System.out.println("DDD nao cadastrado");
   }
   
//
  }
//
}