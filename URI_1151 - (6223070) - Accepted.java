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
int n,i=0,j,k, aux;
n = sc.nextInt();
if(n>0 && n<46){
j=0;
aux = 1;
k = 1;
while(i<=n){
for(i=1;i<=n; i=i+1){
if(i<n){
System.out.print(j+" ");
}
else {
System.out.print(j+"\n");  
}
aux = j;
j = j+k;
k = aux;
}
}
}
//
    }
}