package funcoes;

import java.util.Scanner;

/**
 * exercicio007
 */
public class exercicio007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prestacoes = 0;
        double valorTotal = 0;

        boolean encerrar = false;

        do {
            System.out.print("Valor da prestação: ");
            double valorPrestacao = scanner.nextDouble();

            if (valorPrestacao == 0) {
                encerrar = true;
                break;
            }

            System.out.print("Dias de atraso: ");
            int diasAtraso = scanner.nextInt();

            double valorPagar = valorPagamento(valorPrestacao, diasAtraso);

            System.out.printf("O valor a ser pago é de R$ %.2f reais.", valorPagar);

            prestacoes++;
            valorTotal += valorPagar;
        } while (!encerrar);

        System.out.println("RELATÓRIO:");
        System.out.println("Quantidade de prestações : " + prestacoes);
        System.out.println("Valor total de prestações pagas : R$ " + valorTotal);
    }

    static double valorPagamento(double valorPrestacao, int diasAtraso) {        
        double valor = 0;

        if (diasAtraso > 0) {
            // valor da prestação + 0.1% de juros por dia de atraso:
            valor = valorPrestacao + (((0.1 * valorPrestacao) / 100) * diasAtraso);
            // valor total à ser pago:
            valor = valor * diasAtraso;
            // valor total à ser pago + multa de 3% por haver atraso:
            valor += (3 * valorPrestacao) / 100;
        } else {
            valor = valorPrestacao;
        }

        return valor;
    }
}