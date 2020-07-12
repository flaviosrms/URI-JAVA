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
int i = 0;
int cont = 0;
int numb;
while (i<5) {
numb = sc.nextInt();
i = i+1;
if (numb%2==0) {
cont=cont+1;
}

}
System.out.println(cont+" valores pares");
    }
}