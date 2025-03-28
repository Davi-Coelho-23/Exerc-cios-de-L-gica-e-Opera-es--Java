// Davi Coelho e Matheus França - 371
// 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Cria o objeto, puxando a "biblioteca" Scanner. O .in serve para mostrar que haverá valores inseridos.


        System.out.print("Insira o valor da base: "); //Pede para o usuário digitar o valor
        double base = scanner.nextDouble(); //Recebe o dado inserido. Nome da variável: base. scanner.nextDouble (poderia ser int) é a semântica para um "scanf"
        if (base <= 0) {
            while (base <= 0) //while serve para, literalmente, enquanto for menor ou igual a zero
            { 
                System.out.println("O valor da base deve ser maior que zero.");
                System.out.print("Insira o valor da base novamente: ");
                base = scanner.nextDouble(); //Após a validação, reatribui o valor
            }
        }

        System.out.print("Insira o valor da altura: ");
        double altura = scanner.nextDouble();
        if (altura <= 0) {
            while (altura <= 0) {
                System.out.println("O valor da altura deve ser maior que 0.");
                System.out.print("Digite o valor da altura novamente: ");
                altura = scanner.nextDouble();
            }
        }
        
        double area = base * altura;
        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}