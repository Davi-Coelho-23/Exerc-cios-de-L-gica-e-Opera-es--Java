//Exercício 8
//Davi Coelho e Matheus França

import java.util.Scanner;

public class Ex8 
{
    public static void main(String[] args) 
    {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário a quantidade de milhas náuticas
        System.out.print("Digite a quantidade de milhas náuticas: ");
        double milhasNauticas = scanner.nextDouble();
        
        double quilometros = milhasNauticas * 1.852;
        
        // Exibe o resultado
        System.out.println(milhasNauticas + " milhas náuticas é igual a " + quilometros + " quilômetros.");
        
        // Fecha o scanner
        scanner.close();       
    }
}