package listas;

import java.util.Scanner;

/**
 * exercicio003
 */
public class exercicio003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%dª nota: ", (i + 1));
            notas[i] = scanner.nextDouble();

            media += notas[i];
        }

        System.out.println("Notas:");

        for (double nota : notas)
            System.out.println("- " + nota);
        
        System.out.println("Média: " + (media / 4));
    }
}