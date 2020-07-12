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
int i=1,j,k;
for(j=7; j>=5 && i<=9;j=j-1){
System.out.println("I="+i+" J="+j); 
if (j<=5){
i = i+2;
j = 8;
}
}  
    }
}