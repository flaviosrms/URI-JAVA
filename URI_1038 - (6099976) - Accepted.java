import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
      static double conta( double a, double b) {
      double total = a*b;
      return total;
     }
    
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
  
    double cod, qtd, total, v1 = 4, v2 = 4.5 , v3 = 5 , v4 = 2, v5 = 1.5;
    cod = sc.nextDouble();
    qtd = sc.nextDouble();
  if (cod == 1) {
  cod = v1;
  }
 else if (cod == 2){
  cod = v2; 
 }
 else if (cod == 3){
  cod = v3;   
 }
  else if (cod == 4){
 cod = v4;   
 }
  else if (cod == 5){
 cod = v5;   
 }
System.out.printf("Total: R$ %.2f\n", conta(cod, qtd));
    }
}