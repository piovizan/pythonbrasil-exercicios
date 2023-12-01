package estruturasequencial;
import java.util.Scanner;

/**
 * 11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    a. o produto do dobro do primeiro com metade do segundo .
    b. a soma do triplo do primeiro com o terceiro.
    c. o terceiro elevado ao cubo.
 */
public class exercicio011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número (inteiro): ");
        int n1 = scanner.nextInt();

        System.out.println("Segundo número (inteiro): ");
        int n2 = scanner.nextInt();

        System.out.println("Terceiro número (real): ");
        double n3 = scanner.nextDouble();

        System.out.println("a. " + ((n1 * 2) * (n2 / 2)));
        System.out.println("b. " + ((n1 * 3) + n3));
        System.out.println("c. " + (n3 * n3 * n3));
    }
}