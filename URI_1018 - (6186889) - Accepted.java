import java.io.IOException;
import java.util.Scanner;
//V2 COM VETORES
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutars
 */
public class Main {


    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
    int notas [] = {100, 50, 20, 10, 5, 2, 1};
    
    int numb, i, resto;
        numb = sc.nextInt();
          
          if (numb>0 && numb<=1000000){
System.out.println(numb);
resto = numb;
for (i=0; i<=6; i=i+1){
              System.out.println((resto/notas[i])+" nota(s) de R$ "+notas[i]+",00");
resto = resto%notas[i];
}
}

    }
}
