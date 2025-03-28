/*
 * 17. 0 Pesquisar as funções Exp e Ln.

Davi Coelho e Matheus França.
 */
import java.util.Scanner;

public class Ex17
{
    public static void main(String[] args)
    {
     
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o primeiro valor: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double y = scanner.nextDouble();

        double result = Math.pow(x, y);
        System.out.println(x + " elevado a " + y + "é igual a: " + result);

        scanner.close();
    }
}
