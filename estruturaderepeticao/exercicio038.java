package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio038
 */
public class exercicio038 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário inicial: R$ ");
        double salario = scanner.nextDouble();

        double aumento = 1.5;

        for (int i = 1995 + 1; i <= 2023; i++) {
            salario += (aumento * salario) / 100;
            aumento *= 2;
        }

        System.out.printf("Salário atual : R$ %.2f\n", salario);
    }
}