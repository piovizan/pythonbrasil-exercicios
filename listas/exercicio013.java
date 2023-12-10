package listas;

import java.util.Scanner;

/**
 * exercicio013
 */
public class exercicio013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double[] temperaturaMedia = new double[12];

        double mediaAnual = 0;

        for (int i = 0; i < meses.length; i++) {
            System.out.printf("Temperatura média de %s:\n", meses[i]);
            temperaturaMedia[i] = scanner.nextDouble();

            mediaAnual += temperaturaMedia[i];
        }

        mediaAnual = mediaAnual / temperaturaMedia.length;

        System.out.printf("Temperatura média anual: %.2f C°\n", mediaAnual);

        System.out.println("Temperaturas acima da média anual: ");

        for (int j = 0; j < meses.length; j++) {
            if (temperaturaMedia[j] > mediaAnual)
                System.out.printf("%s | %.2f C°\n", meses[j], temperaturaMedia[j]);

        }
    }
}