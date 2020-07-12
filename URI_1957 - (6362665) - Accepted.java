import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
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
int i = 0;
int cont=0;
int h[] = new int[8];
int num = sc.nextInt();
if (num>=1 && num<=2000000000){
for (i=0; num>=16;i=i+1){
h[i] = num%16;
num = num/16;
cont = cont+1;
}
h[i] = num;
for (i=cont;i>=0; i=i-1){
if (h[i]==10){
System.out.print("A"); 
}
else if (h[i]==11){
System.out.print("B");  
}
else if (h[i]==12){
System.out.print("C");
}
else if (h[i]==13){
System.out.print("D");
}
else if (h[i]==14){
System.out.print("E");  
}
else if (h[i]==15){
System.out.print("F"); 
}
else {
System.out.print(h[i]);
}
}
System.out.print("\n");
}
   }
}