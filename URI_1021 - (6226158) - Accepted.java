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
int n100=0, n50=0, n20=0, n10=0, n5=0, n2=0;
int m1=0, m50=0, m25=0, m10=0, m05=0, m01=0;

double num;
num = sc.nextDouble();
if(num>=0 && num<=1000000.00){
System.out.println("NOTAS:");
n100 = (int)(Math.floor(num/100));
num = num%100;
System.out.println(n100+" nota(s) de R$ 100.00");

n50 = (int)(Math.floor(num/50));
num = num%50;
System.out.println(n50+" nota(s) de R$ 50.00");

n20 = (int)(Math.floor(num/20));
num = num%20;
System.out.println(n20+" nota(s) de R$ 20.00");

n10 = (int)(Math.floor(num/10));
num = num%10;
System.out.println(n10+" nota(s) de R$ 10.00");

n5 = (int)(Math.floor(num/5));
num = num%5;
System.out.println(n5+" nota(s) de R$ 5.00");

n2 = (int)(Math.floor(num/2));
num = num%2;
System.out.println(n2+" nota(s) de R$ 2.00");

System.out.println("MOEDAS:");
m1 = (int)(Math.floor(num/1));
num = num%1;
System.out.println(m1+" moeda(s) de R$ 1.00");

num = num + 0.0001;
num = (int)Math.floor(num*100);

//
m50 = (int)(Math.floor(num/50));
num = num%50;
System.out.println(m50+" moeda(s) de R$ 0.50");

m25 = (int)(Math.floor(num/25));
num = num%25;
System.out.println(m25+" moeda(s) de R$ 0.25");

m10 = (int)(Math.floor(num/10));
num = num%10;
System.out.println(m10+" moeda(s) de R$ 0.10");

m05 = (int)(Math.floor(num/5));
num = num%5;
System.out.println(m05+" moeda(s) de R$ 0.05");

m01 = (int)(Math.floor(num/1));
num = num%1;
System.out.println(m01+" moeda(s) de R$ 0.01");
}
//
    }
}