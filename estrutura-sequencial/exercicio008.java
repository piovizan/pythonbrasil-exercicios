import java.util.Scanner;

/**
 * 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 */
public class exercicio008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ganhaPorHora;
        double horasTrabalhadas;

        System.out.println("Quanto você ganha por hora?");
        ganhaPorHora = scanner.nextDouble();

        System.out.println("Horas trabalhadas: ");
        horasTrabalhadas = scanner.nextDouble();

        double salario = ganhaPorHora * horasTrabalhadas;

        System.out.println("Salário : R$" + salario);
    }
}