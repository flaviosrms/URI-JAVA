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
    int i = 0,num = 0, j = 0;
    long soma = 0, fat = 1;
    int v[] = new int[2];
   //
    while(sc.hasNext()){
      for (i=0; i<2; i=i+1){
        num = sc.nextInt();
        v[i] = num;
          for(j=v[i]; j>=1; j=j-1){
            fat = fat*j;
          }
        soma = soma+fat;
        fat=1;
      }
      if ( (v[0]>=0 &&  v[0]<=20) && (v[1]>=0 && v[1]<=20) ){
      System.out.println(soma);
   }
       soma = 0;
  }
   }
 }
