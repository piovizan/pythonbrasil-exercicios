package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio028
 */
public class exercicio028 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carne = "";

        double precoTotal = 0;
        double valorPagar = 0;
        double desconto;

        System.out.println("                          Até 5 Kg       Acima de 5 Kg");
        System.out.println("1 - Filé Duplo      R$ 4,90 por Kg      R$ 5,80 por Kg");
        System.out.println("2 - Alcatra         R$ 5,90 por Kg      R$ 6,80 por Kg");
        System.out.println("3 - Picanha         R$ 6,90 por Kg      R$ 7,80 por Kg");

        System.out.print("Tipo de carne: ");
        int tipo = scanner.nextInt();

        System.out.print("Quantidade (em Kg): ");
        double quantidade = scanner.nextDouble();

        System.out.print("O pagamento será feito com o cartão Tabajara? (s/n): ");
        char cartao = scanner.next().charAt(0);

        if (tipo == 1) {
            carne = "Filé Duplo";

            if (quantidade > 5)
                precoTotal = quantidade * 5.80;
            else
                precoTotal = quantidade * 4.90;
        } else if (tipo == 2) {
            carne = "Alcatra";

            if (quantidade > 5)
                precoTotal = quantidade * 6.80;
            else
                precoTotal = quantidade * 5.90;
        } else if (tipo == 3) {
            carne = "Picanha";

            if (quantidade > 5)
                precoTotal = quantidade * 7.80;
            else
                precoTotal = quantidade * 6.90;
        } else {
            System.out.println("precoTotal inválido");
        }

        System.out.println("Tipo da carne: " + carne);
        System.out.println("Quantidade de carne: " + quantidade + "Kg");
        System.out.println("Preço total: R$ " + precoTotal);

        switch (cartao) {
            case 's':
                desconto = (5 * precoTotal) / 100;                
                valorPagar = precoTotal - desconto;
                
                System.out.println("Tipo de pagamento: Cartão Tabajara");
                break;        
            default:
                desconto = 0;

                System.out.println("Tipo de pagamento: Outro");                
                break;
        }
        
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor a pagar: R$ " + valorPagar);
    }
}