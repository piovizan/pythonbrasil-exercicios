package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio015
 */
public class exercicio015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 1;
        int num2 = 0;

        System.out.printf("%d %d ", num2, num1);

        do {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.printf("%d ", num1);
        } while (num1 < 500);
    }
}