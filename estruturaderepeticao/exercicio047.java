package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio047
 */
public class exercicio047 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Atleta: ");
        String atleta = scanner.nextLine();

        double nota;

        double melhorNota = Double.MIN_VALUE;
        double piorNota = Double.MAX_VALUE;
        double media = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Nota: ");
            nota = scanner.nextDouble();

            if (nota > melhorNota)
                melhorNota = nota;

            if (nota < piorNota)
                piorNota = nota;

            media += nota;
        }

        System.out.println("Resultado final:");
        System.out.println("Atleta: " + atleta);
        System.out.printf("Melhor nota: %.1f\n", melhorNota);
        System.out.printf("Pior nota: %.1f\n", piorNota);

        media -= melhorNota;
        media -= piorNota;
        media /= 5;

        System.out.printf("Média: %.2f", media);
    }
}