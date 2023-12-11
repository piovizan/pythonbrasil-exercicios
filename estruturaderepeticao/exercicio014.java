package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio014
 */
public class exercicio014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int par = 0;
        int impar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%dº número: ", i);
            num = scanner.nextInt();

            if (num % 2 == 0)
                par++;
            else
                impar++;
        }

        System.out.printf("%d numeros pares e %d numeros ímpares", par, impar);
    }
}