package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio026
 */
public class exercicio026 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tipo de combustível (A-álcool | G-gasolina): ");
        char tipo = scanner.next().charAt(0);

        System.out.print("Litros: ");
        double litros = scanner.nextDouble();

        double preco = 0;

        if (tipo == 'A') {
            preco = litros * 1.90;

            if (litros <= 20)
                preco -= litros * ((3 * preco) / 100);
            else
                preco -= litros * ((5 * preco) / 100);
        } else if (tipo == 'G') {
            preco = litros * 2.50;

            if (litros <= 20)
                preco -= litros * ((4 * preco) / 100);
            else
                preco -= litros * ((6 * preco) / 100);
        } else {
            System.out.println("Tipo inválido");
        }

        System.out.println("Valor total : R$ " + preco);
    }
}