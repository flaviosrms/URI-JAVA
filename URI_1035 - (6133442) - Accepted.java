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
    int va, vb, vc, vd, soma;
    va = sc.nextInt();
    vb = sc.nextInt();
    vc = sc.nextInt();
    vd = sc.nextInt();
    
     if (vb>vc && vd>va && (vc+vd)>(va+vb) && vc>=0 && vd>=0 && va%2==0){
       System.out.println("Valores aceitos");
     }
     else {
       System.out.println("Valores nao aceitos");
     }

 
    }
 
}