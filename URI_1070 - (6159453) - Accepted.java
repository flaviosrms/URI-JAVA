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
    int numb;
    int i = 0;
    int cont = 0;
    
    numb = sc.nextInt();
      i = numb;
    while (cont<6){
       if(i%2!=0){
     cont = cont+1;
     System.out.println(i);
    }
   i=i+1;
    }
    //
    }
}