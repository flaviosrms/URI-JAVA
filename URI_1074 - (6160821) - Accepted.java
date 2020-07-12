import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutars
 */
public class Main {


    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
    int num, qtd;
    int i = 0;
    qtd = sc.nextInt();
    if(qtd<10000){
    while(i<qtd){
    num = sc.nextInt();
    i = i+1;
    if (num>=-10000000 && num<=10000000){
    if (num == 0){
    System.out.println("NULL");
    }
    //
    
    if (num!=0 && num%2==0) {
    if (num>0){
    System.out.println("EVEN POSITIVE");
    }
    else {
    System.out.println("EVEN NEGATIVE");  
    }
    }
    //
    
    if (num!=0 && num%2!=0){
       if (num>0){
    System.out.println("ODD POSITIVE");  
    }
    else {
    System.out.println("ODD NEGATIVE");  
    } 
    }
    }
    }
    }
//
    }
}
