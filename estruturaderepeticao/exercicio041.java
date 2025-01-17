package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio041
 */
public class exercicio041 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da dívida: ");
        double valor = scanner.nextDouble();

        int juros = 10;
        double valorJuros;
        double valorDivida;
        double valorParcela;

        System.out.printf("R$ %-10.2f %-10d %-10d R$ %.2f\n", valor, 0, 1, valor);

        for (int i = 3; i <= 12; i += 3) {
            valorJuros = (valor * juros) / 100;
            valorDivida = valor + valorJuros;
            valorParcela = valorDivida / i;

            System.out.printf("R$ %-10.2f %-10.2f %-10d R$ %.2f\n", valorDivida, valorJuros, i, valorParcela);

            juros += 5;
        }
    }
}