import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {


    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     double l1, l2, l3;
     double A = 0;
     double B = 0;
     double C = 0;
     l1 = sc.nextDouble();
     l2 = sc.nextDouble();
     l3 = sc.nextDouble();
   //
   if(l1>=l2 && l1>=l3){
   A = l1;
   B = Maior(l2,l3);
   C = Menor(l2,l3);
   }
   else if (l2>=l1 && l2>=l3) {
   A = l2;
   B = Maior(l1,l3);
   C = Menor(l1,l3); 
   }
   else if (l3>=l1 && l3>=l2){
   A = l3;
   B = Maior(l1,l2);
   C = Menor(l1,l2); 
   }
//

  else if (l1==l2 && l2==l3) {
  A = l1;
  B = l2;
  C = l3;
  }
  //
  else if (l1==l2 && l2!=l3){
  A = Maior(l2,l3);
  B = Maior(l2,l3);
  C = Menor (l2,l3);
  }
    else if (l1==l3 && l3!=l2){
  A = Maior(l1,l2);
  B = Maior(l1,l2);
  C = Menor (l1,l2);
  }
      else if (l3==l2 && l2!=l1){
  A = Maior(l3,l1);
  B = Maior(l3,l1);
  C = Menor (l3,l1);
  }
  
  
  if (A>0 && B>0 && C>0) {
      Triangulo(A, B, C); 
  }
    }
    
static void Triangulo (double x, double y, double z){

if (x>=(y+z)) {
System.out.println("NAO FORMA TRIANGULO");
}
else{
if (Math.pow(x,2)==(Math.pow(y,2)+Math.pow(z,2))) {
System.out.println("TRIANGULO RETANGULO");
}
else if (Math.pow(x,2)>(Math.pow(y,2)+Math.pow(z,2))) {
System.out.println("TRIANGULO OBTUSANGULO");
}
else if (Math.pow(x,2)<(Math.pow(y,2)+Math.pow(z,2))) {
System.out.println("TRIANGULO ACUTANGULO");
}
if (x==y && y==z) {
System.out.println("TRIANGULO EQUILATERO");
}
if ((x==y && x!=z) ||(y==z && y!=x)||(x==z && x!=y)) {
System.out.println("TRIANGULO ISOSCELES");
}
}
}
//
static Double Maior (double d, double e){
Double ma;
if (d>=e) {
  ma = d;
  
}
else {
  ma = e;
}
  return ma;
}
//
static Double Menor (double f, double g){
double mn;
if (f<=g) {
  mn = f;
}
else {
  mn = g;
}
  return mn;
}


//

}