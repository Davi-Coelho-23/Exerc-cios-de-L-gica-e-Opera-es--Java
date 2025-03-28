/*
 * 13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
 */
//Davi Coelho e Matheus França.

//A validação só foi feita na variável "tempo" pois, de acordo com os conceito-base da cinemática, o tempo não pode ser negativo, mas a aceleração e a velocidade podem.
//A velocidae
import java.util.Scanner;

public class Ex13 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite a velocidade inicial em metros por segundo: ");
        double velocidadeInicial = scanner.nextDouble();
        System.out.println("Digite a aceleração em minutos por segundo ao quadrado: ");
        double aceleraçao = scanner.nextDouble();
        System.out.println("Digite o tempo de percurso em segundos: ");
        double tempo = scanner.nextDouble();
        if (tempo <= 0) 
        {
            while (tempo <= 0)
            { 
                System.out.println("A quantidade de tempo deve ser maior que zero. Digite novamente: ");
                tempo = scanner.nextDouble(); 
            }
        }
        System.out.println("A velocidade final, em quilômetros por hora, é: " + ((velocidadeInicial)+(aceleraçao*tempo)*3.6));
        scanner.close();
    }
}
