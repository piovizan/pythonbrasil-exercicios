import java.util.Scanner;

/**
 * 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 * (obs. ainda sem usar estruturas de repetição)
 */
public class exercicio004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média é: " + media);
    }
}