package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio005
 */
public class exercicio005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean encerra = false;

        System.out.print("População do país A: ");
        int paisA = scanner.nextInt();

        System.out.print("Taxa de crescimento anual do pais A: ");
        double taxaCrescimentoA = scanner.nextDouble();

        System.out.print("População do país B: ");
        int paisB = scanner.nextInt();

        System.out.print("Taxa de crescimento anual do pais B: ");
        double taxaCrescimentoB = scanner.nextDouble();

        int anos = 0;

        while (!encerra) {
            while (taxaCrescimentoA <= taxaCrescimentoB) {
                System.out.println("Para ocorrer a ultrapassagem de população, a taxa de crescimento do pais A precisa ser maior que a taxa de crescimento do pais B");

                System.out.print("Taxa de crescimento anual do pais A: ");
                taxaCrescimentoA = scanner.nextDouble();

                System.out.print("Taxa de crescimento anual do pais B: ");
                taxaCrescimentoB = scanner.nextDouble();
            }

            while (paisA < paisB) {
                paisA += (int) (taxaCrescimentoA * paisA) / 100;
                paisB += (int) ((taxaCrescimentoB * paisB) / 100);
                anos++;
            }

            System.out.printf("Serão necessários %d anos para o país A ultrapassar ou se igualhar a população do país B\n", anos);

            System.out.print("Repetir operação? [s/n] ");
            
            if (scanner.next().charAt(0) == 'n')
                encerra = true;
        };
    }
}