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
int a,b;
double i,j,aux=1;
for (i = 0; i<=2.0; i=i+0.2){
for (j=aux; j<=aux+2; j =j+1){

if ((i>1.8 && i<=2.4)|| i==1.0 || i==0.0){
a = (int)(Math.ceil(i));
System.out.print("I="+a);
}
else {
System.out.printf("I=%.1f",i);
}
if (j==1.0 ||(j>1.9 && j<=2.0) || (j>2.9 && j<=3.0) ||(j>3.9 && j<=4.0) ||(j>4.9 && j<=5.0)){
b = (int)(Math.ceil(j));
System.out.println(" J="+b);
}
else if (j==1.0 ||(j>=2.0 && j<2.1) || (j>=3.0 && j<=3.1) ||(j>=4.0 && j<=4.1) ||(j>=5.0 && j<=5.1)){
b = (int)(Math.floor(j));
System.out.println(" J="+b);  
}
else {
System.out.printf(" J=%.1f\n",j);
}
}
aux = aux+0.2; 
}
//
    }
}