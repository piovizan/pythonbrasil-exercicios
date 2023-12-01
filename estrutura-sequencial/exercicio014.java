import java.util.Scanner;

/**
 * 14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
 */
public class exercicio014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excesso;

        System.out.println("Peso de peixes: ");
        double peso = scanner.nextDouble();

        System.out.println("Peso de peixes: " + peso + "kgs");

        if (peso > 50) {
            excesso = peso - 50;
            System.out.println("Quantidade de peso além do limite: " + excesso + "kgs");
            System.out.println("Multa : R$" + (4 * excesso));
        } else {
            System.out.println("Peso dentro do limite");
        }
    }
}