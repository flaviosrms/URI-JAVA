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
String class1, class2, class3;
class1 = sc.nextLine();
class2 = sc.nextLine();
class3 = sc.nextLine();
if(class1.equals("vertebrado")) {
  if(class2.equals("ave")) {
    if(class3.equals("carnivoro")) {
      System.out.println("aguia");
      }
    else if(class3.equals("onivoro")) {
      System.out.println("pomba");
      }
  }
  else if(class2.equals("mamifero")) {
    if(class3.equals("onivoro")) {
      System.out.println("homem");
    }
    else if(class3.equals("herbivoro")) {
      System.out.println("vaca");
    }
  }
}
if(class1.equals("invertebrado")) {
  if(class2.equals("inseto")) {
    if(class3.equals("hematofago")) {
      System.out.println("pulga");
    }
    else if(class3.equals("herbivoro")) {
      System.out.println("lagarta");
    }
  }
  else if(class2.equals("anelideo")) {
    if(class3.equals("hematofago")) {
      System.out.println("sanguessuga");
    }
    else if(class3.equals("onivoro")) {
      System.out.println("minhoca");
    }
  }
}
//
    }
}