package listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * exercicio004
 */
public class exercicio004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] caracteres = new char[10];
        ArrayList<Character> consoantes = new ArrayList<>();

        for (int i = 0; i < caracteres.length; i++) {
            System.out.printf("%dº caractere: ", (i + 1));
            caracteres[i] = scanner.next().charAt(0);

            if (caracteres[i] != 'a' && caracteres[i] != 'e' && caracteres[i] != 'i' && caracteres[i] != 'o' && caracteres[i] != 'u')
                consoantes.add(caracteres[i]);
        }

        System.out.printf("%d consoantes foram lidas, sendo elas: ", consoantes.size());

        consoantes.forEach(System.out::print);
}