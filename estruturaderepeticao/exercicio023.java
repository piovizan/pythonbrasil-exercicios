package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio023
 */
public class exercicio023 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mostrar números primos de 1 à: ");
        int n = scanner.nextInt();

        int cont;

        for (int i = 1; i <= n; i++) {
            cont = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    cont++;
            }

            if (cont == 2)
                System.out.println(i);
        }
    }
}