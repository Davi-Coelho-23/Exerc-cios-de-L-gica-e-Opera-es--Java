//exercicio 16 Matheus Correia de França e Davi Leite Coelho

import java.util.Scanner;

public class Ex16 
{

    public static void main(String[] args) 
    {
        // Criação do scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o valor do ângulo em graus
        System.out.print("Digite o valor do ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        // Converter o ângulo de graus para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);

        // Calcular e exibir as funções trigonométricas
        System.out.printf("Seno de %.2f°: %.4f\n", anguloGraus, Math.sin(anguloRadianos));
        System.out.printf("Cosseno de %.2f°: %.4f\n", anguloGraus, Math.cos(anguloRadianos));
        System.out.printf("Tangente de %.2f°: %.4f\n", anguloGraus, Math.tan(anguloRadianos));
        System.out.printf("Secante de %.2f°: %.4f\n", anguloGraus, 1 / Math.cos(anguloRadianos));
        System.out.printf("Cossecante de %.2f°: %.4f\n", anguloGraus, 1 / Math.sin(anguloRadianos));
        System.out.printf("Cotangente de %.2f°: %.4f\n", anguloGraus, 1 / Math.tan(anguloRadianos));

        // Fechar o scanner
        scanner.close();
    }
}