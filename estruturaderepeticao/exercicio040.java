package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio040
 */
public class exercicio040 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        int veiculos;
        int acidentes;

        int cidadeMaiorIndice = 0;
        int cidadeMenorIndice = 0;
        int cidadeMenosVeiculos = 0; // número de cidades com menos de 2.000 veículos

        int maiorIndiceAcidentes = Integer.MIN_VALUE;
        int menorIndiceAcidentes = Integer.MAX_VALUE;

        int mediaVeiculos = 0;
        int mediaAcidentes = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("CIDADE " + i);

            System.out.print("Código da cidade: ");
            codigo = scanner.nextInt();

            System.out.print("Número de veículos de passeio: ");
            veiculos = scanner.nextInt();

            System.out.print("Número de acidentes de trânsito com vítimas: ");
            acidentes = scanner.nextInt();

            if (acidentes > maiorIndiceAcidentes) {
                cidadeMaiorIndice = codigo;
                maiorIndiceAcidentes = acidentes;
            }

            if (acidentes < menorIndiceAcidentes) {
                cidadeMenorIndice = codigo;
                menorIndiceAcidentes = acidentes;
            }

            if (veiculos < 2000) {
                cidadeMenosVeiculos++;
                mediaAcidentes += acidentes;
            }

            mediaVeiculos += veiculos;
        }

        System.out.println("MAIOR ÍNDICE DE ACIDENTES");
        System.out.println("Cidade: " + cidadeMaiorIndice);
        System.out.println("Acidentes: " + maiorIndiceAcidentes);

        System.out.println("MENOR ÍNDICE DE ACIDENTES");
        System.out.println("Cidade: " + cidadeMenorIndice);
        System.out.println("Acidentes: " + menorIndiceAcidentes);

        System.out.println("Média de véiculos nas cinco cidades: " + (mediaVeiculos / 5));
        System.out.println("Média de acidentes nas cidades com menos de 2.000 veículos: " + (mediaAcidentes / cidadeMenosVeiculos));
    }
}