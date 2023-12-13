package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio027
 */
public class exercicio027 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de turmas: ");
        int turmas = scanner.nextInt();

        int alunos;
        int media = 0;

        for (int i = 1; i <= turmas; i++) {
            do {
                System.out.printf("Quantidade de alunos da %dª turma: ", i);
                alunos = scanner.nextInt();

                if (alunos > 40)
                    System.out.println("As turmas não podem ter mais de 40 alunos");
            } while (alunos > 40);

            media += alunos;
        }

        media = media / turmas;

        System.out.println("Média de alunos por turma: " + media);
    }
}