package estruturasequencial;
import java.util.Scanner;

/**
 * 2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
 */
public class exercicio002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        System.out.println("O número informado foi " + numero);
    }
}