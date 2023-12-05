package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio022
 */
public class exercicio022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0)
            System.out.println(numero + " é par");
        else
            System.out.println(numero + " é impar");
    }
}