package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio001
 */
public class exercicio001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10)
                System.out.println("Valor inválido!");
        } while (nota < 0 || nota > 10);
    }
}