package listas;

import java.util.Scanner;

/**
 * exercicio012
 */
public class exercicio012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[30];
        double[] alturas = new double[30];

        int maiorTreze = 0;
        double mediaAlturas = 0;

        for (int i = 0; i < 30; i++) {
            System.out.printf("%d aluno", (i + 1));

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            
            System.out.print("Altura: ");
            alturas[i] = scanner.nextDouble();

            mediaAlturas += alturas[i];
        }
        
        mediaAlturas /= alturas.length;
        
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAlturas)
                maiorTreze++;
        }

        System.out.printf("%d alunos com mais de 13 anos possuem à altura inferior à %.2f", maiorTreze, mediaAlturas);
    }
}