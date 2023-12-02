package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio005
 */
public class exercicio005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeira nota:");
        double n1 = scanner.nextDouble();

        System.out.println("Segunda nota:");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        if (media == 10)
            System.out.println("Aprovado com Distinção");
        else if (media >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
}