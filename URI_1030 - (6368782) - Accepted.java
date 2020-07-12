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
int t = sc.nextInt();
int flag = 0;
if (t>=1 && t<=30){
while(t>0){
flag = flag+1;
int n = sc.nextInt();
int k = sc.nextInt();
if (n>=1 && n<=10000 && k>=1 && k<=1000){
int i=0, inicio=0,c1=0,c2=0,aux=0;
int x[] = new int [n];
for (i=0; i<n; i=i+1){
x[i]=i+1;
}
while (c2<n-1){
for(i=0; i<n; i=i+1){
if (c1==k){
x[aux] = 0;
c2=c2+1;
c1=0;
}
if(x[i]!=0){
c1=c1+1;
aux=i;
} 
}
}
System.out.println("Case "+flag+": "+mostraVetor(x, n));
}
t=t-1;
}
}
   }
static int mostraVetor(int v[], int n){
int j=0;
while (v[j]==0){
j=j+1;
}
return v[j];
 }
}
