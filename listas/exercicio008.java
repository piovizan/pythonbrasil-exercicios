package listas;

import java.util.Scanner;

/**
 * exercicio008
 */
public class exercicio008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idade = new int[5];
        double[] altura = new double[5];

        for (int i = 0; i < idade.length; i++) {
            System.out.printf("%dª pessoa:\n", (i + 1));
            
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();

            System.out.print("Altura: ");
            altura[i] = scanner.nextDouble();
        }

        System.out.println("Imprimindo na ordem inversa");

        for (int j = idade.length - 1; j >= 0; j--) {
            System.out.printf("%d anos | %.2fm\n", idade[j], altura[j]);
        }
    }
}