import java.io.IOException;
import java.util.Scanner;
//V1 COM VETORES
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutars
 */
public class Main {


    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
    int i;
    int x [] = new int [10];
for(i=0; i<=9; i=i+1){
x[i] = sc.nextInt();

if(x[i]<=0){
x[i] = 1;  
}
}
for (i=0; i<=9; i=i+1){
System.out.println("X["+i+"] = "+x[i]);  
}
//
    }
}
