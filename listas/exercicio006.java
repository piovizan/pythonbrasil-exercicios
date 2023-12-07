package listas;

import java.util.Scanner;

/**
 * exercicio006
 */
public class exercicio006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] medias = new double[10];
        int alunosMediaMaior = 0;

        for (int i = 0; i < medias.length; i++) {
            System.out.printf("%dº aluno:\n", (i + 1));
            
            for (int j = 0; j < 4; j++) {
                System.out.printf("%dª nota: ", (j + 1));
                medias[i] += scanner.nextDouble();
            }

            medias[i] /= 4;

            if (medias[i] >= 7)
                alunosMediaMaior++;
        }

        System.out.print(alunosMediaMaior + " alunos tiveram média maior ou igual a 7.0");
    }
}