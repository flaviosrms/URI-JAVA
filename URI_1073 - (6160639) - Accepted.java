import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutars
 */
public class Main {


    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
    int num, qdd;
    int i = 0;
    num = sc.nextInt();
    if(num>5 && num<2000){
    while (i<=num){ 
    i = i+1;
    if (i%2==0){
    qdd = (int)Math.pow(i,2); 
    System.out.println(i+"^2 = "+qdd);
    }
    }
    }
//
    }
}
