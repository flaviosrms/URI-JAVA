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
int x, y, i;
x = sc.nextInt();
y = sc.nextInt();
if ((x>1 && x<20)&&(y>x && y<100000)){
for(i=1; i<y; i=i+1){
if (i%x==0 && i<y){
System.out.print(i+"\n");  
}
else {
System.out.print(i+" ");
}
if ((i+1)==y){
System.out.print(y+"\n"); 
}
}
}
// 
    }
}