import java.util.Scanner;

/**
 * 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 */
public class exercicio008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double ganhaPorHora = scanner.nextDouble();

        System.out.println("Horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salario = ganhaPorHora * horasTrabalhadas;

        System.out.println("Salário : R$" + salario);
    }
}