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
int soma = 0;
int num = 1;
while(num!=0){
num = sc.nextInt();
if(num>=1 && num<=100){
soma = (num*(num+1)*(2*num+1))/6;
System.out.println(soma); 
soma = 0;
}
}
}   
 }
