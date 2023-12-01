package estruturasequencial;
import java.util.Scanner;

/**
 * 3. Faça um Programa que peça dois números e imprima a soma.
 */
public class exercicio003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Segundo número: ");
        int n2 = scanner.nextInt();

        System.out.println(n1 + n2);
    }
}