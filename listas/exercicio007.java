package listas;

import java.util.Scanner;

/**
 * exercicio007
 */
public class exercicio007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        int soma = 0;
        int mult = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%dº número: ", (i + 1));
            numeros[i] = scanner.nextInt();

            soma += numeros[i];
            mult *= numeros[i];
        }

        System.out.println("Soma dos números: " + soma);
        System.out.println("Multiplicação: " + mult);
        System.out.print("Números lidos: ");

        for (int numero : numeros)
            System.out.println(numero);
    }
}