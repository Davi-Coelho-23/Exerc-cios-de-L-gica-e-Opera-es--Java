//exercicio 18 Matheus Correia de França e Davi Leite Coelho

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar os preços dos 5 produtos
        System.out.print("Digite o preço do primeiro produto: ");
        double produto1 = scanner.nextDouble();
        
        System.out.print("Digite o preço do segundo produto: ");
        double produto2 = scanner.nextDouble();
        
        System.out.print("Digite o preço do terceiro produto: ");
        double produto3 = scanner.nextDouble();
        
        System.out.print("Digite o preço do quarto produto: ");
        double produto4 = scanner.nextDouble();
        
        System.out.print("Digite o preço do quinto produto: ");
        double produto5 = scanner.nextDouble();
        
        // Solicitar o valor do pagamento
        System.out.print("Digite o valor pago: ");
        double valorPago = scanner.nextDouble();
        
        // Calcular a soma dos produtos
        double somaProdutos = produto1 + produto2 + produto3 + produto4 + produto5;
        
        // Calcular o troco
        double troco = valorPago - somaProdutos;
        
        // Exibir o resultado
        if (troco < 0) {
            System.out.println("Valor insuficiente para pagar os produtos.");
        } else {
            System.out.printf("O valor total dos produtos é: R$ %.2f\n", somaProdutos);
            System.out.printf("O valor do troco é: R$ %.2f\n", troco);
        }
        
        // Fechar o scanner
        scanner.close();
    }
}