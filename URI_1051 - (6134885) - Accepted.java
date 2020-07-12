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
        double val;
         val = sc.nextDouble();
          if(val>=0 && val<=2000){
  System.out.println("Isento");
  }
  else {
         System.out.printf("R$ %.2f\n", imposto(val)); 
    }
  
//
}
//
static Double imposto(double x){
    Double  imp;
  if (x>2000 && x<=3000){
  imp = (x-2000)*0.08;
  }
  else if (x>3000 && x<=4500){
  imp = ((x-3000)*0.18) + 1000*0.08;
  }
  else {
  imp = ((x-4500)*0.28) + (1000*0.08) + (1500*0.18);
  }
  return imp;
//
  }
//
}