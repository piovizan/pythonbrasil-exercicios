package manipulandostrings;

import java.util.Scanner;

/**
 * exercicio005
 */
public class exercicio005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String nome = scanner.nextLine();

        for (int i = nome.length(); i > 0; i--) {
            System.out.println(nome.toUpperCase().substring(0, i));
        }
    }
}