package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio024
 */
public class exercicio024 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Tipo de operação:\n1. par ou impar\n2. positivo ou negativo\n3. inteiro ou decimal");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                if (num1 % 2 == 0)
                    System.out.println(num1 + " é par");
                else
                    System.out.println(num1 + " é ímpar");
                
                if (num2 % 2 == 0)
                    System.out.println(num2 + " é par");
                else
                    System.out.println(num2 + " é ímpar");
                break;
            case 2:
                if (num1 > 0)
                    System.out.println(num1 + " é positivo");
                else
                    System.out.println(num1 + " é negativo");
                
                if (num2 > 0)
                    System.out.println(num2 + " é positivo");
                else
                    System.out.println(num2 + " é negativo");
                break;
            case 3:
                if (num1 % 1 == 0)
                System.out.println((int) num1 + " é um número inteiro");
                else
                    System.out.println(num1 + " é um número decimal");

                if (num2 % 1 == 0)
                    System.out.println((int) num2 + " é um número inteiro");
                else
                    System.out.println(num2 + " é um número decimal");
                break;
            default:
                break;
        }
    }
}