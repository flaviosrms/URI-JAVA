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
  float val = 0;
  int i=0, j=0;
  char [] T = new char[1];
    int L = sc.nextInt();
    T[0] = sc.next().charAt(0);
    if(L>=0 && L<=11 && T[0] =='S' || T[0] == 'M'){
        float [][] mat = new float [12][12];
          for(i=0;i<12; i=i+1){
              for (j=0;j<12; j=j+1){
                mat[i][j]= sc.nextFloat(); 
              }
          }
    if(T[0] =='M' ||T[0] == 'S'){
      for(i=0;i<12; i=i+1){
        val = val + mat[L][i] ; 
      }
    }
    if(T[0] == 'M'){
      val = val/12 ; 
    }
  }
System.out.printf("%.1f\n", val);
   }
 }