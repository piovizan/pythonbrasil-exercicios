package listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * exercicio014
 */
public class exercicio014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> perguntas = new ArrayList<>();

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int sim = 0;
        char resposta;

        System.out.println("Responda as perguntas com [s/n]");

        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i));
            resposta = scanner.next().charAt(0);

            if (resposta == 's') sim++;
        }

        if (sim == 2)
            System.out.println("Suspeita");
        else if (sim >= 3 && sim <= 4)
            System.out.println("Cúmplice");
        else if (sim == 5)
            System.out.println("Assassino");
        else
            System.out.println("Inocente");
    }
}