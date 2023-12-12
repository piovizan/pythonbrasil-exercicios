package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio024
 */
public class exercicio024 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas serão lidas: ");
        int n = scanner.nextInt();

        double media = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("%dª nota: ", i);
            media += scanner.nextDouble();
        }

        media = media / n;

        System.out.println("Média das notas: " + media);
    }
}