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
int i,j, num, soma;
i = sc.nextInt();
if (i>=1 && i<=20){
while (i>0){
 num = sc.nextInt();
 if(num>=1 && num<=100000000){
soma = 0;
for (j=1; j<num; j=j+1){
if (num%j==0){
soma = soma + j;  
}  


}
if (soma == num){
System.out.println(num+" eh perfeito");
}
else {
System.out.println(num+" nao eh perfeito");  
}
i=i-1;

 }  
}
}
//
    }
}