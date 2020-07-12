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
int num1,num2, a, b, i, soma = 0;
num1 = sc.nextInt();
num2 = sc.nextInt();
while (num1>0 && num2>0){
if (num1>=num2){
for (i=num2; i<=num1; i=i+1){
soma = soma + i;
System.out.print(i+" ");
}
}
else {
for (i=num1; i<=num2; i=i+1){
soma = soma + i;
System.out.print(i+" ");
} 
}
System.out.println("Sum="+soma);  
soma = 0;
num1 = sc.nextInt();
num2 = sc.nextInt();
}
    }
}