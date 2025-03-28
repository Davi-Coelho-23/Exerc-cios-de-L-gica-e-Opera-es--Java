//exercicio 12 Matheus Correia de França e Davi Leite Coelho
import java.util.Scanner;

public class Ex12{
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário a altura do cone
        System.out.print("Digite a altura do cone: ");
        double alturaCone = scanner.nextDouble();
        
        // Solicita ao usuário o raio da base do cone
        System.out.print("Digite o raio da base do cone: ");
        double raioBaseCone = scanner.nextDouble();
        
        // Calcula o volume do cone
        double volume = (1.0/3.0) * Math.PI * Math.pow(raioBaseCone, 2) * alturaCone;
        
        // Exibe o resultado
        System.out.println("O volume do cone é: " + volume);
        
        // Fecha o scanner
        scanner.close();
    }
}
