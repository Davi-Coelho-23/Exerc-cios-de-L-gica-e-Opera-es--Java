// Davi Coelho e Matheus França
//3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.

import java.util.Scanner;


public class Ex3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Insira o valor da diagonal do quadrado: \n");
        double diagonal = scanner.nextDouble();
        if (diagonal <= 0) 
        {
            while (diagonal <= 0)
            { 
                System.out.println("O valor da base deve ser maior que zero.");
                System.out.print("Insira o valor da base novamente: ");
                diagonal = scanner.nextDouble(); 
            }
        }
        double area = (diagonal*diagonal)/2;
        System.out.println("Área do quadrado: " + area + "cm²");

        scanner.close();

    }
}
