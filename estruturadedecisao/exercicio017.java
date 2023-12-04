package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio017
 */
public class exercicio017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        if (ano % 4 == 0)
            System.out.println(ano + " é um ano bissexto");
        else
            System.out.println(ano + " não é um ano bissexto");
    }
}