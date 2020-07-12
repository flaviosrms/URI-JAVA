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
       int v1, v2, v3, maior, menor, medio;
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        v3 = sc.nextInt();
        menor = Num_Menor(Num_Menor(v1,v2),v3);
        maior = Num_Maior(Num_Maior(v1,v2),v3);
        System.out.println(menor);
        if(v1!=menor && v1!=maior) {
          System.out.println(v1);         
        }
        if(v2!=menor && v2!=maior) {
          System.out.println(v2);  
        }
        if(v3!=menor && v3!=maior) {
          System.out.println(v3); 
        }
        System.out.println(maior+"\n");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
}
    static int Num_Menor (int a, int b){
      int me;
        if (a<b){
          me = a;
        }
        else {
          me = b;
        }
    return me;
  }
  
      static int Num_Maior (int c, int d){
      int ma;
        if (c>d){
          ma = c;
        }
        else {
          ma = d;
        }
    return ma;
      }
}