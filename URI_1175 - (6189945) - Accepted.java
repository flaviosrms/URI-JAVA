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
    int i=0;
    int n [] = new int [20];
    int auxiliar [] = new int [10];
    for(i=0; i<=19; i=i+1) {
    n[i] = sc.nextInt();
    if (i<=9){
    auxiliar[i] = n[i];  
    }
}
for(i=0; i<=19; i=i+1){
if (i<=9){
n[i] = n[19-i]; 
}
else {
n[i] = auxiliar[19-i];
}
System.out.println("N["+i+"] = "+n[i]);
}
    }
}
