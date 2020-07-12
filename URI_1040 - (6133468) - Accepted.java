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
      float n1, n2, n3, n4, n5, md, md_final;
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();
        md = (n1*2 + n2*3 + n3*4 + n4*1)/10;
        if (md>=7){
        System.out.printf("Media: %.1f\n", md);
        System.out.println("Aluno aprovado.");
        }
        else if (md>=5 && md<=6.9){
          System.out.printf("Media: %.1f\n", md);
          System.out.println("Aluno em exame.");
          n5 = sc.nextFloat();
          md = (md + n5)/2;
          System.out.println("Nota do exame: "+n5);
          
            if(md>=5) {
              System.out.println("Aluno aprovado."); 
            }
            else if (md<5) {
             System.out.println("Aluno reprovado."); 
            }

          System.out.printf("Media final: %.1f\n", md);
        }
        else {
         System.out.printf("Media: %.1f\n", md);        
         System.out.println("Aluno reprovado."); 
        }

 
    }
 
}