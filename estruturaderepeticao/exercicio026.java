package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio026
 */
public class exercicio026 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;

        System.out.print("Número total de eleitores: ");
        int eleitores = scanner.nextInt();

        int voto;

        System.out.println("1 - candidado 1\n2 - candidato 2\n3 - candidato 3");

        for (int i = 1; i <= eleitores; i++) {
            System.out.printf("%dº eleitor: ", i);
            voto = scanner.nextInt();

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
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        }

        System.out.printf("1º candidato : %d votos\n", candidato1);
        System.out.printf("2º candidato : %d votos\n", candidato2);
        System.out.printf("3º candidato : %d votos\n", candidato3);
    }
}