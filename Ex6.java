//Exercício 6 Matheus Correia de França e Davi Leite Coelho
import java.util.Scanner;

public class Ex6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Entrada do valor da primeira nota
        System.out.print("Digite o valor da primeira nota: ");
        double nota1 = sc.nextDouble();
		
		// Entrada do valor da segunda nota
		System.out.print("Digite o valor da segunda nota: ");
        double nota2 = sc.nextDouble();
		// Entrada do valor da terceira nota
		System.out.print("Digite o valor da terceira nota: ");
        double nota3 = sc.nextDouble();
		System.out.print("Digite o valor da quarta nota: ");
        double nota4 = sc.nextDouble();
        // Cálculo da área
        double mediaAritimetica = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média aritimética do aluno é: " + mediaAritimetica);
    }
}