package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio039
 */
public class exercicio039 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aluno 1");

        System.out.print("Número do aluno: ");
        int numero = scanner.nextInt();

        System.out.print("Altura do aluno (cm): ");
        int altura = scanner.nextInt();;

        int numeroMaisAlto = numero;
        int numeroMaisBaixo = numero;

        int alturaMaisAlto = altura;
        int alturaMaisBaixo = altura;

        for (int i = 2; i <= 10; i++) {
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