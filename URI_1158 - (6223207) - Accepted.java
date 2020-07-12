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
int n, x, y, i, soma = 0, cont = 0;
n = sc.nextInt();
while (n>0){
cont = 0;
soma = 0;
x = sc.nextInt(); 
y = sc.nextInt(); 
for (i=x; cont<y; i=i+1){
if(i%2!=0){
cont = cont+1;
soma = soma + i;  
}
}
System.out.println(soma);

n=n-1;  
}
    }
}