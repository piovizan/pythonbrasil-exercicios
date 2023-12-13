package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio031
 */
public class exercicio031 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;

        double produto;
        double total = 0;

        double dinheiro;
        double troco;

        boolean encerra = false;

        while (!encerra) {
            System.out.println("Lojas Tabajara");

            i = 1;

            do {
                System.out.printf("Produto %d: R$ ", i);
                produto = scanner.nextDouble();
                
                total += produto;
                i++;
            } while (produto != 0);

            System.out.printf("Total: R$ %.2f", total);

            System.out.print("\nDinheiro: R$ ");
            dinheiro = scanner.nextDouble();

            troco = dinheiro - total;

            System.out.printf("Troco: R$ %.2f\n", troco);

            System.out.println("...");
            System.out.print("Seguir para próxima compra? [s/n] ");

            if (scanner.next().charAt(0) == 'n')
                encerra = true;
        }
    }
}