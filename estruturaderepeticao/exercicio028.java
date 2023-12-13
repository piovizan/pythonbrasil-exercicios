package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio028
 */
public class exercicio028 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de CDs: ");
        int quantidadeCds = scanner.nextInt();

        double totalInvestido = 0;
        double valorMedioGasto;

        for (int i = 1; i <= quantidadeCds; i++) {
            System.out.printf("Valor do %dº cd: R$", i);
            totalInvestido += scanner.nextDouble();
        }

        valorMedioGasto = totalInvestido / quantidadeCds;

        System.out.printf("Total investido na coleção : R$%.2f", totalInvestido);
        System.out.printf("\nValor médio gasto em cada CD: R$%.2f", valorMedioGasto);
    }
}