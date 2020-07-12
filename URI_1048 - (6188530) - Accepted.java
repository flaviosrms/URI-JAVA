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
    int per=0;
    float sal, n_sal=0;
    sal = sc.nextFloat();
      if (sal>=0 && sal<=400){
        n_sal = sal*(float)(1.15);  
        per = 15;
    }
    
      if (sal>400 && sal<=800){
        n_sal = sal*(float)(1.12);  
        per = 12;
      
    }
      if (sal>800 && sal<=1200){
        n_sal = sal*(float)(1.10);  
        per = 10;
      
    }
      if (sal>1200 && sal<=2000){
        n_sal = sal*(float)(1.07);  
        per = 7;
    }
    if (sal>2000){
        n_sal = sal*(float)(1.04);  
        per = 4;
    }

System.out.printf("Novo salario: %.2f\n", n_sal);
System.out.printf("Reajuste ganho: %.2f\n", (n_sal-sal));
System.out.println("Em percentual: "+per+" %");

//
}
}
