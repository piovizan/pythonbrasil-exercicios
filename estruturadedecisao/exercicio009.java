package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio009
 */
public class exercicio009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Segundo número:");
        int num2 = scanner.nextInt();;

        System.out.println("Terceiro número:");
        int num3 = scanner.nextInt();;

        int maior = num1;
                
        if (num2 > maior)
        maior = num2;
        if (num3 > maior)
        maior = num3;
        
        int menor = num1;

        if (num2 < menor)
            menor = num2;
        if (num3 < menor)
            menor = num3;

        int meio = num1;

        if (num2 < maior && num2 > menor)
            meio = num2;
        if (num3 < maior && num3 > menor)
            meio = num3;

        System.out.println(maior + " " + meio + " " + menor);
    }
}