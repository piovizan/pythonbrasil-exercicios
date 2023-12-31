package manipulandostrings;

import java.util.Scanner;

/**
 * exercicio008
 */
public class exercicio008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String input = scanner.nextLine().toUpperCase().trim().replace(" ", "");
        String aocontrario = "";

        boolean palindromo = false;
        
        for (int i = input.length() - 1; i >= 0; i--) {
            aocontrario += input.charAt(i);
        }

        if (aocontrario.equals(input))
            palindromo = true;



        System.out.println(palindromo);
    }
}