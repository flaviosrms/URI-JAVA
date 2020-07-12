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
     int mes;
     mes = sc.nextInt();
     Meses(mes);
}
static void Meses (int m){
  if (m == 1){
  System.out.println("January");
  }
  else if (m == 2){
  System.out.println("February"); 
  }
  else if (m == 3){
  System.out.println("March");
  }
  else if (m == 4){
  System.out.println("April"); 
  }
  else if (m == 5){
  System.out.println("May");
  }
  else if (m == 6){
  System.out.println("June"); 
  }
  else if (m == 7){
  System.out.println("July");
  }
  else if (m == 8){
  System.out.println("August"); 
  }
  else if (m == 9){
  System.out.println("September"); 
  }
  else if (m == 10){
   System.out.println("October");
  }
  else if (m == 11){
   System.out.println("November");  
  }
  else if (m == 12) {
   System.out.println("December"); 
  }
   }
}