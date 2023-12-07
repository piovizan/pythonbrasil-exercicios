package listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * exercicio005
 */
public class exercicio005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%dº número: ", (i + 1));
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0)
                par.add(numeros[i]);
            else
                impar.add(numeros[i]);
        }

        System.out.print("Números: ");

        for (int numero : numeros)
            System.out.print(numero);
        
        System.out.print("\nPares: ");
        par.forEach(System.out::print);

        System.out.print("\nÍmpares: ");
        impar.forEach(System.out::print);
    }
}