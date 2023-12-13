package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio034
 */
public class exercicio034 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int cont = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0)
                cont++;
        }

        if (cont == 2)
            System.out.println(numero + " é um número primo");
        else
            System.out.println(numero + " não é um número primo");
    }
}