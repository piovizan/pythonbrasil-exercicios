package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio018
 */
public class exercicio018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores serão lidos? ");
        int n = scanner.nextInt();

        int num;
        int maior = 0;
        int menor = 0;
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("%dº número: ", i);
            num = scanner.nextInt();

            soma += num;

            if (num > maior)
                maior = num;

            if (menor != 0 && num < menor)
                menor = num;
            else
                menor = maior;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
    }
}