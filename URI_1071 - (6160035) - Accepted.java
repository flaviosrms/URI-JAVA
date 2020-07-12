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
  int num1, num2, i, j;
  int soma = 0;
  num1 = sc.nextInt();
  num2 = sc.nextInt();
 if(num1<=num2){
  i = num1;
  j = num2;
 }
 else {
  i = num2;
  j = num1;  
 }
 while (i<j){
  i = i+1;
 if (i%2!=0 && i!=j){
  soma = soma+i;
 ;
 }
 }
 System.out.println(soma);
    }
}
