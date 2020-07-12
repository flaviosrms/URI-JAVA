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
 
      String nome;
      double slr_fixo, t_vendas, m_total;
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        slr_fixo = sc.nextDouble();
        t_vendas = sc.nextDouble();
          m_total = slr_fixo + ((3.0/20)* t_vendas);
            System.out.printf("TOTAL = R$ %.2f\n", m_total);
    }
}