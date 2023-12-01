package estruturadedecisao;

import java.util.Scanner;

/**
 * 7. Faça um Programa que leia três números e mostre o maior e o menor deles.
 */
public class exercicio007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Terceiro número:");
        int num3 = scanner.nextInt();

        int maior = num1;

        if (num2 > maior)
            maior = num2;
        if (num3 > maior)
            maior = num3;
        
        System.out.println("Maior número: " + maior);

        int menor = num1;

        if (num2 < menor)
            menor = num2;
        if (num3 < menor)
            menor = num3;
        
        System.out.println("Menor número: " + menor);
    }
}