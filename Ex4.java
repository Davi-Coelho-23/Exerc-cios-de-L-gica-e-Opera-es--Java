//Exercício 4 Matheus Correia de França e Davi Leite Coelho
import java.util.Scanner;

public class Ex4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Entrada do valor da base triângulo
        System.out.print("Digite o valor da base do triângulo: ");
        double base = sc.nextDouble();
		
		// Entrada do valor da altura triângulo
		System.out.print("Digite o valor da altura do triângulo: ");
        double altura = sc.nextDouble();
        // Cálculo da área
        double areaTriangulo = (base * altura) / 2;
        System.out.println("A área do triangulo é: " + areaTriangulo);
    }
}