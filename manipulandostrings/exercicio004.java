package manipulandostrings;

import java.util.Scanner;

/**
 * exercicio004
 */
public class exercicio004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String nome = scanner.nextLine();

        for (int i = 0; i <= nome.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(nome.toUpperCase().charAt(j));
            }
            System.out.println();
        }
    }
}