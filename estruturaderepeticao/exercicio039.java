package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio039
 */
public class exercicio039 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int altura;

        int numeroMaisAlto = 0;
        int numeroMaisBaixo = 0;

        int alturaMaisAlto = Integer.MIN_VALUE;
        int alturaMaisBaixo = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Aluno " + i);

            System.out.print("Número do aluno: ");
            numero = scanner.nextInt();

            System.out.print("Altura do aluno (cm): ");
            altura = scanner.nextInt();

            if (altura > alturaMaisAlto) {
                numeroMaisAlto = numero;
                alturaMaisAlto = altura;
            }

            if (altura < alturaMaisBaixo) {
                numeroMaisBaixo = numero;
                alturaMaisBaixo = altura;
            }
        }

        System.out.println("Aluno mais alto");
        System.out.println("Número: " + numeroMaisAlto);
        System.out.println("Altura: " + alturaMaisAlto);

        System.out.println("Aluno mais baixo");
        System.out.println("Número: " + numeroMaisBaixo);
        System.out.println("Altura: " + alturaMaisBaixo);
    }
}