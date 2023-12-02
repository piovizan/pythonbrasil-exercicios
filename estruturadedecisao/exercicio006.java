package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio006
 */
public class exercicio006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Terceiro número:");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3)
            System.out.println("O maior número é: " + num1);
        else if (num2 > num1 && num2 > num3)
            System.out.println("O maior número é: " + num2);
        else
            System.out.println("O maior número é: " + num3);
    }
}