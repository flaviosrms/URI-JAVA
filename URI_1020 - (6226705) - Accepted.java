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
int num;
num = sc.nextInt();

int ano = num/365;
num = num%365;
int mes = num/30;
int dias = num%30;
System.out.println(ano+" ano(s)\n"+mes+" mes(es)\n"+dias+" dia(s)");

//
    }
}