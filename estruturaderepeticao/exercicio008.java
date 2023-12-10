package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio008
 */
public class exercicio008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;
        int media;

        for (int i = 0; i < 5; i++) {
            System.out.printf("%dº número: ", (i + 1));
            numero = scanner.nextInt();

            soma += numero;
        }

        media = soma / 5;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média: " + media);
    }
}