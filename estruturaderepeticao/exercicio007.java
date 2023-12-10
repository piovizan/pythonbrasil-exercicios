package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio007
 */
public class exercicio007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("%dº número: ", (i + 1));
            numero = scanner.nextInt();

            if (numero > maior)
                maior = numero;
        }

        System.out.println("O maior número foi " + maior);
    }
}