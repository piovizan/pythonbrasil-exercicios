package manipulandostrings;

import java.util.Scanner;

/**
 * exercicio002
 */
public class exercicio002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String nome = scanner.nextLine();

        for (int i = nome.length() - 1; i >= 0; i--) {
            System.out.print(nome.toUpperCase().charAt(i));
        }
    }
}