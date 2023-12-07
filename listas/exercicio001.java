package listas;

import java.util.Scanner;

/**
 * exercicio001
 */
public class exercicio001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%dº número: ", (i + 1));
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros)
            System.out.println(numero);
    }
}