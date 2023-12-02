package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio004
 */
public class exercicio004 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
            System.out.println(letra + " é uma vogal");
        else
            System.out.println(letra + " é uma consoante");
    }
}