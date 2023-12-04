package funcoes;

import java.util.Scanner;

/**
 * exercicio001
 */
public class exercicio001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas o loop terá? ");
        int linhas = scanner.nextInt();

        loop(linhas);
    }
    static void loop(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}