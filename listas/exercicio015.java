package listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * exercicio015
 */
public class exercicio015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        double valor;
        double soma = 0;
        int acimaMedia = 0;
        int abaixoSete = 0;

        do {
            System.out.print("Nota: ");
            valor = scanner.nextDouble();

            // o último valor não conta pq é para encerrar o programa
            if (valor != -1) {
                notas.add(valor);
                soma += valor;

                if (valor < 7)
                    abaixoSete++;
            }
        } while (valor != -1);

        System.out.println("Quantidade de valores que foram lidos: " + notas.size());

        System.out.println("Valores na ordem em que foram lidos: ");
        for (double n : notas) {
            System.out.print(n + " ");
            if (n > (soma / notas.size()))
                acimaMedia++;
        }

        System.out.println("\nValores na ordem inversa em que foram lidos: ");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.print(notas.get(i) + " ");
        }

        System.out.println("\nSoma dos valores: " + soma);
        System.out.println("Média os valores: " + (soma / notas.size()));
        System.out.println("Quantidade de valores acima da média: " + acimaMedia);
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoSete);
    }
}