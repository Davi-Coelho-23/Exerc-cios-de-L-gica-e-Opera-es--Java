//5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
//Davi Coelho e Matheus França

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do diâmetro da esfera: \n");
        double diametro = scanner.nextDouble();
        if (diametro <= 0)
        {
            while (diametro <= 0)
            {
                System.out.println("O valor do diâmetro deve ser maior do que zero.\n");
                System.out.print("Insira o valor do diâmetro novamente:\n");
                diametro = scanner.nextDouble();

            }
        }
        double raio = diametro / 2;
        double area = ((1.33)*(3.14)*(raio*raio*raio));
        System.out.println("O valor da área é: " + area + "cm²");

        scanner.close();
    }
}
