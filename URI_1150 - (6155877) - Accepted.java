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
     int x,z;
     int cont = 1;
     int soma = 0;
     x = sc.nextInt();
     z = sc.nextInt();
    int i = x;
     while (z<=x) {
     z = sc.nextInt();
     
     }
     i = x;
     soma = i;
     while (soma<=z){
     i = i+1;
     soma = soma+i;
    if (i>x){
    cont = cont+1;
    }   
     }
     System.out.println(cont);
//
}
}
