package manipulandostrings;

import java.util.Scanner;

/**
 * exercicio007
 */
public class exercicio007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int espacosEmBranco = 0;
        int[] vogais = {0, 0, 0, 0, 0};

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ')
                espacosEmBranco++;
            
            if (frase.charAt(i) == 'a')
                vogais[0]++;
            if (frase.charAt(i) == 'e')
                vogais[1]++;
            if (frase.charAt(i) == 'i')
                vogais[2]++;
            if (frase.charAt(i) == 'o')
                vogais[3]++;
            if (frase.charAt(i) == 'u')
                vogais[4]++;
        }

        System.out.printf("Existem %d espaços em branco na frase\n", espacosEmBranco);
        System.out.printf("A vogal 'a' apareceu %d vezes na frase\n", vogais[0]);
        System.out.printf("A vogal 'e' apareceu %d vezes na frase\n", vogais[1]);
        System.out.printf("A vogal 'i' apareceu %d vezes na frase\n", vogais[2]);
        System.out.printf("A vogal 'o' apareceu %d vezes na frase\n", vogais[3]);
        System.out.printf("A vogal 'u' apareceu %d vezes na frase", vogais[4]);
    }
}