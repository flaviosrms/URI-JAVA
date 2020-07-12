import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutars
 */
public class Main {


    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
 int qtd;
 int in = 0;
 int out = 0;
 int i = 0;
 int numb;
 qtd = sc.nextInt();
 while(i<qtd){
 numb = sc.nextInt();
 if (numb>-10000000 & numb<10000000){
  i = i+1;
 if (numb>=10 && numb<=20){
    in = in+1;
 }
 else {
    out = out+1;
 }
 }
 }
 System.out.println(in+ " in");
 System.out.println(out+ " out");
//
    }
}
