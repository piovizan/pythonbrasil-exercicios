package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio021
 */
public class exercicio021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int cont = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                cont++;
        }

        if (cont == 2)
            System.out.println("É um número primo");
        else
            System.out.println("Não é um número primo");
    }
}