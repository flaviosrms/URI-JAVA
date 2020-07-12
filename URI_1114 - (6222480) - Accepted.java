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
int numb, i;
numb = sc.nextInt();
while(numb!=2002){
if (numb!=2002){
System.out.println("Senha Invalida");  
}
numb = sc.nextInt();
}
if (numb==2002) {
System.out.println("Acesso Permitido");  
}
//
    }
}