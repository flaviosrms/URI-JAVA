import java.io.IOException;
import java.util.Scanner;
/**
 */
 //FLAVIO RAMOS - V1
 public class Main {
   public static void main(String[] args) throws IOException {
  Scanner sc = new Scanner(System.in);
int i=0, j=0;
int a = 0, b = 0;
int N = sc.nextInt();
int M = sc.nextInt();
if (M>=3 && M<=1000 && N>=3 && N<=1000 ){
  int [][] mat = new int [N][M];
  for(i=0; i<N; i=i+1){
    for (j=0; j<M; j=j+1){
     int T = sc.nextInt();
     if (T>=-100 && T<=100){
       mat[i][j] = T;
     }
    }
  }
for (i=0; i<N; i=i+1){
  for (j=0; j<M; j=j+1){
    if (mat[i][j] == 42 && i>=1 && i<N-1 && j>=1 && j<M-1){
     if (mat[i-1][j-1]==7 && mat[i-1][j]==7 && mat[i-1][j+1]==7 && mat[i][j-1]==7 && mat[i][j+1]== 7 && mat[i+1][j-1]==7 && mat[i+1][j]==7 && mat[i+1][j+1]==7){
        a = i+1;
        b = j+1;
     }
    }
  }
}
System.out.println(a+" "+b);
}

}
 }