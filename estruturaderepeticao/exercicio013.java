package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio013
 */
public class exercicio013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base: ");
        int base = scanner.nextInt();

        System.out.print("Expoente: ");
        int expoente = scanner.nextInt();

        int result = 1;

        for (int i = 0; i < expoente; i++) {
            result *= base;
        }

        System.out.printf("%d elevado a %d = %d", base, expoente, result);
    }
}