package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio020
 */
public class exercicio020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media == 10)
            System.out.println("Aprovado com Distinção");
        else if (media >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
        
        System.out.println("Média : " + media);
    }
}