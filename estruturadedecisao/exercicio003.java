package estruturadedecisao;

import java.util.Scanner;

/**
 * 03. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
 */
public class exercicio003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o seu sexo? (f/m): ");
        char sexo = scanner.next().charAt(0); // lendo o primeiro caractere digitado

        System.out.println(sexo);

        switch (sexo) {
            case 'F':
                System.out.println("F - Feminino");
                break;
            case 'M':
                System.out.println("M - Masculino");
                break;
            default:
                System.out.println("Sexo inválido");
                break;
        }
    }
}