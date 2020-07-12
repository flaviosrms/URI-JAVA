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
int a, b, n, t, i;
double g1, g2;
t = sc.nextInt();
for (i=1; i<=t; i=i+1){
n = 0;
a = sc.nextInt();
b = sc.nextInt();
g1 = sc.nextDouble();
g2 = sc.nextDouble();
while (a<=b && n<=100){
a = (int)Math.floor(a*(1+(g1/100)));
b = (int)Math.floor(b*(1+(g2/100)));
n=n+1;
}
if (n<=100){
System.out.println(n+" anos.");
}
else {
System.out.println("Mais de 1 seculo.");  
}
}
//    
}
}