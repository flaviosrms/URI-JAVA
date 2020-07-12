import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {


    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
int i = 0;
int par = 0;
int imp = 0;
int pos = 0;
int neg = 0;

int numb;
while (i<5) {
numb = sc.nextInt();
i = i+1;
if (numb%2==0) {
par = par+1;
}
else {
imp = imp+1;  
}
if (numb>0){
pos = pos+1;  
 }
else if (numb<0){
neg = neg+1;  
 }
}
System.out.println(par+" valor(es) par(es)");
System.out.println(imp+" valor(es) impar(es)");
System.out.println(pos+" valor(es) positivo(s)");
System.out.println(neg+" valor(es) negativo(s)");
    }
}