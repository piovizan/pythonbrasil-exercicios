package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio023
 */
public class exercicio023 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero % 1 == 0)
            System.out.println((int) numero + " é um número inteiro");
        else
            System.out.println(numero + " é um número decimal");
    }
}