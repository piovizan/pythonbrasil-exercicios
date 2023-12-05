package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio025
 */
public class exercicio025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivo = 0;

        System.out.print("Telefonou para a vítima? (s/n): ");
        if (scanner.next().charAt(0) == 's') positivo++;
        
        System.out.print("Esteve no local do crime? (s/n): ");
        if (scanner.next().charAt(0) == 's') positivo++;
        
        System.out.print("Mora perto da vítima? (s/n): ");
        if (scanner.next().charAt(0) == 's') positivo++;

        System.out.print("Devia para a vítima? (s/n): ");
        if (scanner.next().charAt(0) == 's') positivo++;

        System.out.print("Já trabalhou com a vítima? (s/n): ");
        if (scanner.next().charAt(0) == 's') positivo++;
        
        if (positivo > 0 && positivo <= 2)
            System.out.println("Suspeita");
        else if (positivo > 2 && positivo <= 4) 
            System.out.println("Cúmplice");
        else if (positivo == 5)
            System.out.println("Assassino");
        else
            System.out.println("Inocente");
    }
}