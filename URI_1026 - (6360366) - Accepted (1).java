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
while (sc.hasNext()){
int i = 0;
long C = 0;
long numA = sc.nextLong();
long numB = sc.nextLong();
long X[] = new long[32];
long Y[] = new long[32];
  for (i=0; numA!=0; i=i+1){
    X[31-i] = (long)numA%2;
    numA = numA/2;
  }
  for (i=0; numB!=0; i=i+1){
    Y[31-i] = (long)numB%2;
    numB = numB/2;
  }
  for(i=31; i>=0; i=i-1){
    if (X[i]!=Y[i]){
      C = C+(long)Math.pow(2,(31-i));
    }
  }
System.out.println(C);
}
   }
  }
 