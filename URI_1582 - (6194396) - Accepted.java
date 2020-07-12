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
      int i=0, x, y, z;
while(sc.hasNext()) {
x = sc.nextInt();
y = sc.nextInt();
z = sc.nextInt();
tripla(x, y, z);
}
 }
//
static void tripla (int a, int b, int c) {
int mdc = 1, j = 1;
j = maior_num(maior_num(a, b),c); 
if ((Math.pow(a,2) == (Math.pow(b,2)+Math.pow(c,2)))||(Math.pow(b,2) == (Math.pow(a,2)+Math.pow(c,2)))||(Math.pow(c,2) == (Math.pow(a,2)+Math.pow(b,2)))){
while (j>=1){
if(a%j==0 && b%j==0 && c%j==0 ){
mdc = mdc*j;
}
j=j-1;   
}
if(mdc == 1){
System.out.println("tripla pitagorica primitiva");   
}  
else {
System.out.println("tripla pitagorica"); 
}
}
else {
System.out.println("tripla");   
}
}
static int maior_num (int d, int e){
if (d>=e)
return d;
else 
return e;  
} 
//
}

