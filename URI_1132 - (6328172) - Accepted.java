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
int i, soma = 0,inicio, fim;
int x = sc.nextInt();
int y = sc.nextInt();
if (x>y){
inicio = y;
fim = x;
}
else {
inicio = x;
fim = y;
}
for (i=inicio; i<=fim; i=i+1){
if (i%13!=0){
soma = soma+i;
}
}
System.out.println(soma);
//
}
}