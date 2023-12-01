package estruturadedecisao;

import java.util.Scanner;

/**
 * 5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
        - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        - A mensagem "Reprovado", se a média for menor do que sete;
        - A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */
public class exercicio005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeira nota:");
        double n1 = scanner.nextDouble();

        System.out.println("Segunda nota:");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        if (media == 10)
            System.out.println("Aprovado com Distinção");
        else if (media >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
}