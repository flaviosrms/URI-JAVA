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
  // 0 1 1 2 3 5 8 13 21
   public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);  
long i, j=1, aux=0;
int cont = 0;
int t = sc.nextInt();
while(t>0){
j = 1;
aux = 0;
cont = 0;
int num = sc.nextInt();
if (num>=0 && num<=60){
long fibo[] = new long [num+1];
for(i=0;cont<num+1; i=i+aux){
fibo[cont]= i;
cont=cont+1;
aux = j;
j = i;
}
System.out.println("Fib("+num+") = "+fibo[cont-1]);
t=t-1;
}
}
   }
 }