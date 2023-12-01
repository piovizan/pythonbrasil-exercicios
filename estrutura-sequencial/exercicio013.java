import java.util.Scanner;

/**
 * 13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
 */
public class exercicio013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Altura: ");
        double h = scanner.nextDouble();

        double pesoIdealHomens = (72.7 * h) - 58;
        double pesoIdealMulheres = (62.1 * h) - 44.7;

        System.out.println("Para homens, o peso ideal seria: " + pesoIdealHomens);
        System.out.println("Para mulheres, o peso ideal seria: " + pesoIdealMulheres);
    }
}