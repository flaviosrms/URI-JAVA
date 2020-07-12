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
int i, inicio, fim, soma = 0;
int x = sc.nextInt();
int y = sc.nextInt();
if(x>y){
inicio = y;
fim = x;
}
else {
inicio = x;
fim = y;
}
for (i=inicio+1; i<fim; i=i+1){
if (i%5 == 2 ||i%5 == 3){
System.out.println(i);
}
}
//
}
}