package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio014
 */
public class exercicio014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeira nota:");
        double n1 = scanner.nextDouble();

        System.out.println("Segunda nota:");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        char conceito;

        if (media < 4)
            conceito = 'E';
        else if (media < 6)
            conceito = 'D';
        else if (media < 7.5)
            conceito = 'C';
        else if (media < 9)
            conceito = 'B';
        else
            conceito = 'A';

        System.out.println("Média : " + media + " | Conceito : " + conceito);
    }
}