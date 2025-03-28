import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o primeiro valor:\n");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo valor:\n");
        double num2 = scanner.nextDouble();

        double mediaGeometrica = Math.sqrt(num1*num2);
        System.out.println("A média geométrica destes dois números é: " + mediaGeometrica);

        scanner.close();
    }
}
