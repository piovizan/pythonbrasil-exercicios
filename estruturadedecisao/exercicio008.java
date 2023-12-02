package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio008
 */

public class exercicio008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor do primeiro produto:");
        double produto1 = scanner.nextDouble();
        
        System.out.println("Valor do segundo produto:");
        double produto2 = scanner.nextDouble();
        
        System.out.println("Valor do terceiro produto:");
        double produto3 = scanner.nextDouble();

        if (produto1 < produto2 && produto1 < produto3)
            System.out.println("O produto 1 é o mais barato, custando R$" + produto1);
        else if (produto2 < produto1 && produto2 < produto3)
            System.out.println("O produto 2 é o mais barato, custando R$" + produto2);
        else
            System.out.println("O produto 3 é o mais barato, custando R$" + produto3);
    }
}