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
int a,b,n, i, soma=0;
a = sc.nextInt();
b = sc.nextInt();
while (b<=0) {
b = sc.nextInt();  
}
for(i=a;i<(a+b); i=i+1){
soma = soma + i;
}
System.out.println(soma);
//
    }
}