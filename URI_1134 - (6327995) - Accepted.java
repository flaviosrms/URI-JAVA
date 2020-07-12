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
int n, a=0, g=0, d=0;
n = sc.nextInt();
while(n!=4){
if (n==1){
a = a+1; 
}
else if (n==2){
g = g+1;
}
else if (n==3){
d = d+1;
}

n = sc.nextInt();  
}
System.out.println("MUITO OBRIGADO\n"+"Alcool: "+a+"\n"+"Gasolina: "+g+"\n"+"Diesel: "+d);
//
}
}