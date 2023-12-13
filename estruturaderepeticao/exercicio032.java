package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio032
 */
public class exercicio032 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fatorial de: ");
        int n = scanner.nextInt();

        System.out.printf("%d! = ", n);

        StringBuilder fatorialString = new StringBuilder();
        int fatorial = 1;

        for (int i = n; i > 0; i--) {
            fatorialString.append(i).append(" . ");
            fatorial *= i;
        }

        System.out.print(fatorialString.substring(0, fatorialString.length() - 2));
        System.out.print(" = " + fatorial);
    }
}