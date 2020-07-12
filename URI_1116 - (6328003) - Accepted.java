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
int a, b;
double c,aux;
int teste = sc.nextInt();
while(teste>0){
a = sc.nextInt();
b = sc.nextInt();
if (b == 0){
System.out.println("divisao impossivel");
}
else {
aux = b;
c = (a/aux);
System.out.printf("%.1f\n",c);
}
teste=teste-1;
}
//
}
}