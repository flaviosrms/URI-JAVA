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
double num1, num2, soma=0;
int valid = 0;
while (valid != 2){
num1 = sc.nextDouble();
while(!(num1>=0 && num1<=10)){
System.out.println("nota invalida");
num1 = sc.nextDouble();
}
soma = soma+num1;
num2 = sc.nextDouble();
while(!(num2>=0 && num2<=10)){
System.out.println("nota invalida");
num2 = sc.nextDouble();
}
soma = soma+num2;
System.out.printf("media = %.2f\n", (soma/2.0));
System.out.println("novo calculo (1-sim 2-nao)");
valid = sc.nextInt();
while(valid<1 || valid>2){
System.out.println("novo calculo (1-sim 2-nao)");
valid = sc.nextInt();  
}
soma = 0;
}

//
    }
}