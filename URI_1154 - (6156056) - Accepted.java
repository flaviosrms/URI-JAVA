import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {


    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
    int idade;
    int i = 0;
    double soma = 0;
    double media = 0;
    idade = sc.nextInt();
 while (idade>0) {
  if(idade>0){
   soma = soma+idade;
   i = i+1;
  media = soma/i;
  }
 idade = sc.nextInt();
 }
 System.out.printf("%.2f\n", media);

//
}
}
