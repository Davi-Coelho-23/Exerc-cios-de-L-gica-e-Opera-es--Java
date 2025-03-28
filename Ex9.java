/*
9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. 
Utilize a lei de Ohm.
Davi Coelho e Matheus França

*/

import java.util.Scanner;

public class Ex9 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o valor da resistência elétrica em ohms:\n");
        double resistencia = scanner.nextDouble();
        if (resistencia <= 0)
        {
            while (resistencia <= 0)
            {
                System.out.println("O valor da resistência deve ser maior do que zero. Digite novamente!");
                resistencia = scanner.nextDouble();
            }
        }
        System.out.println("Digite o valor da corrente elétrica em amperes:\n");
        double corrente = scanner.nextDouble();
        if (corrente <= 0)
        {
            while (corrente <= 0)
            {
                System.out.println("O valor da resistência deve ser maior do que zero. Digite novamente!");
                corrente = scanner.nextDouble();
            }
        }
        
        System.out.println("A tensão, em volts, é: " + (corrente*resistencia));

        scanner.close();
    }
}
