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
      int inter, grem,i=0, teste=0, vi=0, vg=0, emp=0;
  while(teste!=2){
  inter = sc.nextInt();
  grem = sc.nextInt();
  if (inter>grem){
  vi = vi+1;
  }
  else if (inter<grem){
  vg = vg+1;
  }
  else {
  emp = emp+1;
  }
  i=i+1;
  System.out.println("Novo grenal (1-sim 2-nao)");
  teste = sc.nextInt();
  }
  System.out.println(i+" grenais");
  System.out.println("Inter:"+vi);
  System.out.println("Gremio:"+vg);
  System.out.println("Empates:"+emp);
  if (vi>vg){
   System.out.println("Inter venceu mais");   
  }
  else if (vi<vg){
   System.out.println("Gremio venceu mais"); 
  }
  else {
  System.out.println("Nao houve vencedor");   
  }
//
}
}