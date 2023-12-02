package estruturadedecisao;
import java.util.Scanner;

/**
 * exercicio001
 */
public class exercicio001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2)
            System.out.println("O maior número é " + num2);
        else
            System.out.println("O maior número é " + num2);
    }
}