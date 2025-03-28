import java.util.Scanner;
//11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
//Davi Coelho e Matheus França
public class Ex11 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Insira o valor do diâmetro do círculo: \n");
        double diametro = scanner.nextDouble();
        if (diametro <= 0) 
        {
            while (diametro <= 0)
            { 
                System.out.println("O valor do diâmetro deve ser maior que zero.");
                System.out.print("Insira o valor do diâmetro novamente: ");
                diametro = scanner.nextDouble(); 
            }
        }
        double raio = diametro / 2;
        double area = 3.14*(raio*raio);
        System.out.println("Área do círculo: " + area + "cm²");

        scanner.close();

    }
}
