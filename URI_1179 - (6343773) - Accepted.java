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
  int i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, cont = 0; 
  int x[] = new int[5];
  int y[] = new int[5];
while (cont<15){
int num = sc.nextInt();
cont=cont+1;
if (num%2==0){
x[i] = num;
i=i+1;
}
else {
y[j] = num;  
j=j+1;
}
//
if (j>=5 && cont<=15){
for (l=0; l<5; l=l+1){
System.out.println("impar["+l+"] = "+y[l]);
}
j=0;
}
if (i>=5 && cont<=15){
for (k=0; k<5; k=k+1){
System.out.println("par["+k+"] = "+x[k]);
}  
i=0;
}
//
}
//
for(n=0; n<j && j>0 && cont>=15; n=n+1){
System.out.println("impar["+n+"] = "+y[n]);  
}
//
for(m=0; m<i && i>0 && cont>=15; m=m+1){
System.out.println("par["+m+"] = "+x[m]);  
}
//
   }
 }