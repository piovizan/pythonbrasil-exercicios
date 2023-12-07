package listas;

import java.util.Scanner;

/**
 * exercicio002
 */
public class exercicio002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%dº número: ", (i + 1));
            numeros[i] = scanner.nextInt();
        }

        for (int j = numeros.length - 1; j >= 0; j--) {
            System.out.println(numeros[j]);
        }
    }
}