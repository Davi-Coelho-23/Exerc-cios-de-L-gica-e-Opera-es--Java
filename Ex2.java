//Exercício 2 Matheus Correia de França e Davi Leite Coelho
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Entrada do valor da aresta
        System.out.print("Digite o valor da aresta do quadrado: ");
        double aresta = sc.nextDouble();
        // Cálculo da área
        double areaQuadrado = Math.pow(aresta, 2);
        System.out.println("A área do quadrado é: " + areaQuadrado);
        
    }
}