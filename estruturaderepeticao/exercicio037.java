package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio037
 */
public class exercicio037 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeClientes = 0;

        int codigo;
        double altura;
        double peso;

        double mediaAlturas = 0;
        double mediaPesos = 0;

        int codigoMaisAlto = 0;
        int codigoMaisBaixo = 0;
        int codigoMaisGordo = 0;
        int codigoMaisMagro = 0;

        double alturaMaisAlto = Double.MIN_VALUE;
        double alturaMaisBaixo = Double.MAX_VALUE;
        double alturaMaisGordo = 0;
        double alturaMaisMagro = 0;

        double pesoMaisAlto = 0;
        double pesoMaisBaixo = 0;
        double pesoMaisGordo = Double.MIN_VALUE;
        double pesoMaisMagro = Double.MAX_VALUE;

        while (true) {
            quantidadeClientes++;

            System.out.print("Código: ");
            codigo = scanner.nextInt();

            if (codigo == 0)
                break;

            System.out.print("Altura: ");
            altura = scanner.nextDouble();

            System.out.print("Peso: ");
            peso = scanner.nextDouble();

            mediaAlturas += altura;
            mediaPesos += peso;

            if (altura > alturaMaisAlto) {
                codigoMaisAlto = codigo;
                alturaMaisAlto = altura;
                pesoMaisAlto = peso;
            }

            if (altura < alturaMaisBaixo) {
                codigoMaisBaixo = codigo;
                alturaMaisBaixo = altura;
                pesoMaisBaixo = peso;
            }

            if (peso > pesoMaisGordo) {
                codigoMaisGordo = codigo;
                alturaMaisGordo = altura;
                pesoMaisGordo = peso;
            }

            if (peso < pesoMaisMagro) {
                codigoMaisMagro = codigo;
                alturaMaisMagro = altura;
                pesoMaisMagro = peso;
            }
        }

        System.out.println("Código do cliente mais alto: " + codigoMaisAlto);
        System.out.printf("Altura: %.2f\n", alturaMaisAlto);
        System.out.println("Peso: " + pesoMaisAlto);

        System.out.println("Código do cliente mais baixo: " + codigoMaisBaixo);
        System.out.printf("Altura: %.2f\n", alturaMaisBaixo);
        System.out.println("Peso: " + pesoMaisBaixo);

        System.out.println("Código do cliente mais gordo: " + codigoMaisGordo);
        System.out.printf("Altura: %.2f\n", alturaMaisGordo);
        System.out.println("Peso: " + pesoMaisGordo);

        System.out.println("Código do cliente mais magro: " + codigoMaisMagro);
        System.out.printf("Altura: %.2f\n", alturaMaisMagro);
        System.out.println("Peso: " + pesoMaisMagro);

        System.out.printf("Média das alturas: %.2f\n", (mediaAlturas / (quantidadeClientes - 1)));
        System.out.printf("Média dos pesos: %.2f", (mediaPesos / (quantidadeClientes - 1)));
    }
}