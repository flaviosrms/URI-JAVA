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
int n, i, cubo, quad;
n = sc.nextInt();
if(n>1 && n<1000){
for (i=1; i<=n; i=i+1){
quad =(int)Math.pow(i,2);
cubo = (int)Math.pow(i,3);
System.out.println(i+" "+quad+" "+cubo);
System.out.println(i+" "+(quad+1)+" "+(cubo+1));
}
}
// 
    }
}