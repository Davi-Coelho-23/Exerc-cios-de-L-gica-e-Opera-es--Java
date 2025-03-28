//10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
//Davi Coelho e Matheus França
import java.util.Scanner;

public class Ex10 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}