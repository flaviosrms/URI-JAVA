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
      double var_x, var_y;
        var_x = sc.nextDouble();
        var_y = sc.nextDouble();
      if (var_x == 0 && var_y == 0){
        System.out.println("Origem");
      }  
      else if (var_x == 0) {
        System.out.println("Eixo Y");
      }
      else if (var_y == 0 ) {
        System.out.println("Eixo X");
      }
        else if (var_x>=0 && var_y>0) {
        System.out.println("Q1");
      }
        else if (var_x<0 && var_y>0) {
        System.out.println("Q2");
      }
        else if (var_x<0 && var_y<0) {
        System.out.println("Q3");
      }
        else if (var_x>0 && var_y<0) {
        System.out.println("Q4");
      }

 
    }
 
}