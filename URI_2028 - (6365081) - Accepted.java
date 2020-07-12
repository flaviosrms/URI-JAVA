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
    int i,j, cont = 0;
while (sc.hasNext()){
int num = sc.nextInt();
if (num>=0 && num<=200){
cont = cont+1;
if (num==0){
System.out.println("Caso "+cont+": 1 numero");
}
else {
System.out.println("Caso "+cont+": "+(((num*(num + 1))/2)+1)+" numeros");
}
System.out.print("0");
for (i=1; i<=num; i=i+1){
j=0;
do {
System.out.print(" "+i); 
j=j+1;
} while(j<i);
}
System.out.println("\n");
}
}
   }
}
