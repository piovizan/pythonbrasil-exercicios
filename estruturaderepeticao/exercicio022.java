package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio022
 */
public class exercicio022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int cont = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                cont++;
        }

        if (cont == 2) {
            System.out.println("É um número primo");
        } else {
            System.out.println("Não é um número primo");

            for (int j = 1; j <= num; j++) {
                if (num % j == 0)
                    System.out.println("Divisível por " + j);
            }
        }
    }
}