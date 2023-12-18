package estruturaderepeticao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * exercicio046
 */
public class exercicio046 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> saltos = new ArrayList<>();

        String atleta;

        double melhorSalto;
        double piorSalto;
        double media;

        while (true) {
            media = 0;

            System.out.print("Atleta: ");
            atleta = scanner.nextLine();

            if (atleta.isEmpty())
                break;

            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + "º salto: ");
                saltos.add(scanner.nextDouble());
                scanner.nextLine();
            }

            System.out.println("Atleta: " + atleta);

            for (int j = 0; j < saltos.size(); j++) {
                System.out.printf("%dº salto: %.1f m\n", (j + 1), saltos.get(j));
                media += saltos.get(j);
            }

            Collections.sort(saltos);

            melhorSalto = saltos.get(saltos.size() - 1);
            piorSalto = saltos.get(0);

            System.out.printf("Melhor salto: %.1f m\n", melhorSalto);
            System.out.printf("Pior salto: %.1f m\n", piorSalto);

            System.out.printf("Média dos demais saltos: %.1f m\n", ((media - melhorSalto - piorSalto) / 3));

            System.out.println("Resultado final:");
            System.out.printf("%s: %.1f m\n", atleta, (media / 5));

            saltos.clear();
        }
    }
}