package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio012
 */
public class exercicio012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ver tabuada do número: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", num, i, (num * i));
        }
    }
}