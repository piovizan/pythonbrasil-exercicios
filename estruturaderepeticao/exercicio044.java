package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio044
 */
public class exercicio044 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voto;

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votoNulo = 0;
        int votoBranco = 0;

        int totalVotos = 0;

        System.out.println("1 - Candidato 1\n" +
                           "2 - Candidato 2\n" +
                           "3 - Candidato 3\n" +
                           "4 - Candidato 4\n" +
                           "5 - Voto Nulo\n" +
                           "6 - Voto em Branco");

        do {
            System.out.print("Voto: ");
            voto = scanner.nextInt();

            if (voto != 0)
                totalVotos++;

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    votoNulo++;
                    break;
                case 6:
                    votoBranco++;
                    break;
                default:
                    System.out.println("Voto inválido!");
                    break;
            }
        } while (voto != 0);

        System.out.printf("Candidato 1 | %d votos\n", candidato1);
        System.out.printf("Candidato 2 | %d votos\n", candidato2);
        System.out.printf("Candidato 3 | %d votos\n", candidato3);
        System.out.printf("Candidato 4 | %d votos\n", candidato4);
        System.out.println("Total de votos nulos: " + votoNulo);
        System.out.println("Total de votos em branco: " + votoBranco);

        double porcentagemNulos = ((double) votoNulo / totalVotos) * 100;
        double porcentagemBrancos = ((double) votoBranco / totalVotos) * 100;

        System.out.printf("Porcentagem de votos nulos sobre o total: %.2f%%", porcentagemNulos);
        System.out.printf("\nPorcentagem de votos em branco sobre o total: %.2f%%", porcentagemBrancos);
    }
}