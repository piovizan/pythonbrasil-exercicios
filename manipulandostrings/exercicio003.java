package manipulandostrings;

import java.util.Scanner;

/**
 * exercicio003
 */
public class exercicio003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String nome = scanner.nextLine();

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.toUpperCase().charAt(i));
        }
    }
}