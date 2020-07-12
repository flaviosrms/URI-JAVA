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
int num, i, q, c;
num = sc.nextInt();
if (num>1 && num<1000){
for (i=1; i<=num; i=i+1){
q = (int)Math.pow(i,2);
c = (int)Math.pow(i,3);
System.out.println(i+" "+q+" "+c);
}
}
//
    }
}