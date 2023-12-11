package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio017
 */
public class exercicio017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fatorial do número: ");
        int n = scanner.nextInt();

        System.out.printf("%d!=", n);

        int fatorial = 1;
        StringBuilder fatorialString = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            fatorialString.append(i).append(".");
            fatorial *= i;
        }

        System.out.printf("%s", fatorialString.substring(0, fatorialString.length() - 1)); // removendo '.' na última posição
        System.out.printf("=%d", fatorial);
    }
}