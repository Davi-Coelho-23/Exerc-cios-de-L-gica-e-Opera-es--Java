/*
 * 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
Davi Coelho e Matheus França
 */
import java.util.Scanner;
public class Ex15 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Insira a cotação do dólar em reais: "); 
        double cotacao = scanner.nextDouble(); 
        if (cotacao <= 0) 
        {
            while (cotacao <= 0) 
            { 
                System.out.println("O valor deve ser maior que zero.");
                System.out.print("Insira novamente: ");
                cotacao= scanner.nextDouble();
            }
        }

        System.out.print("Insira o valor, em reais, a ser convertido: ");
        double real = scanner.nextDouble();
        if (real <= 0) 
        {
            while (real <= 0) {
                System.out.println("O valor deve ser maior do que zero.");
                System.out.print("Digite novamente: ");
                real = scanner.nextDouble();
            }
        }
        
        double dolar = real * cotacao;
        System.out.println("A área do retângulo é: " + dolar);

        scanner.close();
    }
}