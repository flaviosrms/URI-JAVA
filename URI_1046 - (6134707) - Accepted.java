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
        int hi, hf,duracao;
         hi = sc.nextInt();
         hf = sc.nextInt();
            System.out.println("O JOGO DUROU "+hora(hi, hf)+" HORA(S)");
      }
  static int hora(int x,int y){
    int tempo;
    if (y>x){
      tempo = y-x;
    }
    else if (y<x){
      tempo = (24-x+y);
    }
    else {
      tempo = 24;
    }
    return tempo;
  }
  
}