import java.io.IOException;
import java.util.Scanner;
//V1 COM VETORES
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutars
 */
public class Main {


    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
    int tmp_total,i,h=0,m=0;
    int tp[] = new int [4];
for(i=0; i<=3; i=i+1){
tp[i]= sc.nextInt();
}
if (tp[2]>tp[0] && tp[3]>tp[1]){
h = tp[2]-tp[0];
m = tp[3]-tp[1];
}
if (tp[2]<tp[0] && tp[3]==tp[1]){
h = 24-(tp[0]-tp[2]);
m = 0;
}
if (tp[2]>=tp[0] && tp[3]<tp[1]){
h = tp[2]-tp[0]-1;
m = 60-(tp[1]-tp[3]);
}
if (tp[2]<tp[0] && tp[3]>tp[1]){
h = 24 - (tp[0]-tp[2]);
m = (tp[3]-tp[1]); 
}
if (tp[2]<tp[0] && tp[3]<tp[1]){
h = 23 - (tp[0]-tp[2]);
m = 60 - (tp[1]-tp[3]);
}
if (tp[0]==tp[1] && tp[2]==tp[3] && tp[0]==tp[3] ||(tp[0]==tp[2] && tp[1]==tp[3])  ){
h = 24;
m = 0;
}
System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");

}
}
