package funcoes;

import java.util.Scanner;

/**
 * exercicio003
 */
public class exercicio003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Terceiro número: ");
        int num3 = scanner.nextInt();

        System.out.println("Soma dos 3 valores: " + soma(num1, num2, num3));
    }

    static int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}