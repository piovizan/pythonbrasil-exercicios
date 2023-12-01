import java.util.Scanner;

/**
 * 12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
 */
public class exercicio012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Peso ideal: " + pesoIdeal);
    }
}