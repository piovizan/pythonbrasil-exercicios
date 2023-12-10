package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio010
 */
public class exercicio010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Segundo número: ");
        int num2 = scanner.nextInt();

        for (int i = num1; i <= num2; i++) {
            System.out.printf("%d ", i);
        }
    }
}