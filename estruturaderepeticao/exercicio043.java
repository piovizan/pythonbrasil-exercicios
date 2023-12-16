package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio043
 */
public class exercicio043 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean encerrar = false;

        int codigo;
        int quantidade;

        double total = 0;

        System.out.println("Especificação   Código  Preço\n" +
                           "Cachorro Quente 100     R$ 1,20\n" +
                           "Bauru Simples   101     R$ 1,30\n" +
                           "Bauru com ovo   102     R$ 1,50\n" +
                           "Hambúrguer      103     R$ 1,20\n" +
                           "Cheeseburguer   104     R$ 1,30\n" +
                           "Refrigerante    105     R$ 1,00");

        while (!encerrar) {
            System.out.print("Código: ");
            codigo = scanner.nextInt();

            System.out.print("Quantidade: ");
            quantidade = scanner.nextInt();

            switch (codigo) {
                case 100:
                    System.out.printf("Cachorro quente | %d unidades | R$ %.2f\n", quantidade, (1.20 * quantidade));
                    total += 1.20 * quantidade;
                    break;
                case 101:
                    System.out.printf("Bauru Simples | %d unidades | R$ %.2f\n", quantidade, (1.30 * quantidade));
                    total += 1.30 * quantidade;
                    break;
                case 102:
                    System.out.printf("Bauru com Ovo | %d unidades | R$ %.2f\n", quantidade, (1.50 * quantidade));
                    total += 1.50 * quantidade;
                    break;
                case 103:
                    System.out.printf("Hambúrger | %d unidades | R$ %.2f\n", quantidade, (1.20 * quantidade));
                    total += 1.20 * quantidade;
                    break;
                case 104:
                    System.out.printf("Cheeseburguer | %d unidades | R$ %.2f\n", quantidade, (1.30 * quantidade));
                    total += 1.30 * quantidade;
                    break;
                case 105:
                    System.out.printf("Refrigerante | %d unidades | R$ %.2f\n", quantidade, (1.00 * quantidade));
                    total += 1.00 * quantidade;
                    break;
            }

            System.out.print("Encerrar pedido? [s/n] ");

            if (scanner.next().charAt(0) == 's')
                encerrar = true;
        }

        System.out.printf("Total do pedido: R$ %.2f", total);
    }
}