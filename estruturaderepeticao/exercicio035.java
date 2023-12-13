package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio035
 */
public class exercicio035 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Exibir números primos entre 1 e: ");
        int n = scanner.nextInt();

        int cont = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    cont++;
            }
            if (cont == 2)
                System.out.println(i);
            
            cont = 0;
        }
    }
}