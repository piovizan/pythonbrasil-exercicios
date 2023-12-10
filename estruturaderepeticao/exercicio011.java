package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio011
 */
public class exercicio011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Segundo número: ");
        int num2 = scanner.nextInt();

        int soma = 0;

        for (int i = num1; i <= num2; i++) {
            System.out.printf("%d ", i);

            soma += i;
        }

        System.out.println("Soma dos números: " + soma);
    }
}