package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio045
 */
public class exercicio045 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O GABARITO DA PROVA");

        System.out.print("01 - ");
        char r1 = scanner.next().charAt(0);
        System.out.print("02 - ");
        char r2 = scanner.next().charAt(0);
        System.out.print("03 - ");
        char r3 = scanner.next().charAt(0);
        System.out.print("04 - ");
        char r4 = scanner.next().charAt(0);
        System.out.print("05 - ");
        char r5 = scanner.next().charAt(0);
        System.out.print("06 - ");
        char r6 = scanner.next().charAt(0);
        System.out.print("07 - ");
        char r7 = scanner.next().charAt(0);
        System.out.print("08 - ");
        char r8 = scanner.next().charAt(0);
        System.out.print("09 - ");
        char r9 = scanner.next().charAt(0);
        System.out.print("10 - ");
        char r10 = scanner.next().charAt(0);

        boolean encerra = false;

        char resposta;

        int alunos = 0;
        int acerto;
        double maiorAcerto = 0;
        double menorAcerto = 0;
        double mediaNotas = 0;

        System.out.println("---------------- P R O V A ----------------");

        while (!encerra) {
            alunos++;
            acerto = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d - ", i);
                resposta = scanner.next().charAt(0);

                if (i == 1 && resposta == r1)
                    acerto++;
                if (i == 2 && resposta == r2)
                    acerto++;
                if (i == 3 && resposta == r3)
                    acerto++;
                if (i == 4 && resposta == r4)
                    acerto++;
                if (i == 5 && resposta == r5)
                    acerto++;
                if (i == 6 && resposta == r6)
                    acerto++;
                if (i == 7 && resposta == r7)
                    acerto++;
                if (i == 8 && resposta == r8)
                    acerto++;
                if (i == 9 && resposta == r9)
                    acerto++;
                if (i == 10 && resposta == r10)
                    acerto++;
            }

            if (acerto > maiorAcerto)
                maiorAcerto = acerto;

            if (alunos == 1)
                menorAcerto = acerto;

            if (acerto < menorAcerto)
                menorAcerto = acerto;

            mediaNotas += acerto;

            System.out.print("Refazer prova? [s/n] ");

            if (scanner.next().charAt(0) == 'n')
                encerra = true;
        }

        System.out.println("Maior acerto: " + maiorAcerto + " respostas corretas");
        System.out.println("Menor acerto: " + menorAcerto + " respostas corretas");
        System.out.println("Total de alunos que fizeram a prova: " + alunos + " alunos");
        System.out.println("Média das notas da turma: " + (mediaNotas / alunos));
    }
}