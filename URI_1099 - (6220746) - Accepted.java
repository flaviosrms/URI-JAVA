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
int n,num1,num2, a, b, i, soma = 0;
n = sc.nextInt();
while (n>0){

num1 = sc.nextInt();
num2 = sc.nextInt();
if (num1>=num2){
a = num2;
b = num1;
}
else {
a = num1;
b = num2; 
}
for (i=a+1; i<b; i=i+1){
if (i%2!=0){
soma = soma + i;
}
}
System.out.println(soma);
n=n-1;
soma = 0;
}
//
    }
}