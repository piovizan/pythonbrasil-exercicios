package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio048
 */
public class exercicio048 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de números: ");
        int numeros = scanner.nextInt();

        String numString = String.valueOf(numeros);

        for (int i = numString.length() - 1; i >= 0; i--) {
            System.out.printf(String.valueOf(numString.charAt(i)));
        }
    }
}