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
    int x, numb;
    int i = 0;
    numb = sc.nextInt();
    if (numb>=1 && numb<=1000){
    while (i<numb){
    i = i+1;
    if (i%2!=0){
    System.out.println(i);
    }
    }
    }
    //
    }
}