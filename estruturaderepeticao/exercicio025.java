package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio025
 */
public class exercicio025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas idades serão lidas? ");
        int n = scanner.nextInt();

        int media = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("%dª idade: ", i);
            media += scanner.nextInt();
        }

        media = media / n;

        System.out.println("Média de idade da turma: " + media + " anos");

        if (media > 0 && media <= 25) {
            System.out.println("É uma turma jovem");
        } else if (media <= 60) {
            System.out.println("É uma turma adulta");
        } else {
            System.out.println("É uma turma idosa");
        }
    }
}