package classes.exercicio09;

import java.util.Scanner;

/**
 * exercicio009
 */
public class exercicio009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        System.out.print("Largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.print("Altura do retângulo: ");
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        do {
            System.out.print("opções: [1 - alterar valores] [2 - imprimir centro] [3 - sair] ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Largura do retângulo: ");
                    retangulo.setLargura(scanner.nextDouble());

                    System.out.print("Altura do retângulo: ");
                    retangulo.setAltura(scanner.nextDouble());
                    break;
                case 2:
                    retangulo.centro();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 3);
    }
}