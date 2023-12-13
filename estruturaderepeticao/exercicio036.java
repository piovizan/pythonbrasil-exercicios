package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio036
 */
public class exercicio036 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int n = scanner.nextInt();

        System.out.print("Começar por: ");
        int inicio = scanner.nextInt();

        System.out.print("Terminar em: ");
        int fim = scanner.nextInt();

        do {
            System.out.println("Fim precisa ser maior que o inicio");
            System.out.print("Terminar em: ");
            fim = scanner.nextInt();
        } while (fim < inicio);

        for (int i = inicio; i <= fim; i++) {
            System.out.printf("%d X %d = %d\n", n, i, (n * i));
        }
    }
}