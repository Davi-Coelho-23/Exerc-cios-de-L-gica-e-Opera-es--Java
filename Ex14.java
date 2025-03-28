//exercicio 14 Matheus Correia de França e Davi Leite Coelho

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        // Criação do scanner para ler os dados de entrada
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar e ler o valor de a (aresta do cubo)
        System.out.print("Digite o valor da aresta do cubo (a): ");
        double a = scanner.nextDouble();
        
        // Verificar se o valor de a é negativo
        if (a < 0) {
            System.out.println("Erro: O valor da aresta do cubo não pode ser negativo.");
        }
        
        // Solicitar e ler o valor de r (raio da esfera)
        System.out.print("Digite o valor do raio da esfera (r): ");
        double r = scanner.nextDouble();
        
        // Verificar se o valor de r é negativo
        if (r < 0) {
            System.out.println("Erro: O valor do raio da esfera não pode ser negativo.");
        }
        
        // Cálculo do volume do cubo
        double volumeCubo = Math.pow(a, 3);
        
        // Cálculo do volume da esfera
        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        
        // Cálculo do volume livre
        double volumeLivre = volumeCubo - volumeEsfera;
        
        // Exibir o resultado
        System.out.printf("O volume livre é: %.2f unidades cúbicas.\n", volumeLivre);
        
        // Fechar o scanner
        scanner.close();
    }
}