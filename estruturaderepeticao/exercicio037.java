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

        System.out.print("Código: ");
        codigo = scanner.nextInt();

        System.out.print("Altura: ");
        altura = scanner.nextDouble();

        System.out.print("Peso: ");
        peso = scanner.nextDouble();

        // todas as variáveis vão receber os valores lidos antes do loop acontecer
        // conforme é feito a comparação entre os clientes, os valores vão se alterando
        // obs: foi a maneira que eu encontrei de resolver o problema de 'váriavel local não inicializada'. dá pra encurtar o código, mas eu preferi assim

        double mediaAlturas = altura;
        double mediaPesos = peso;

        int codigoMaisAlto = codigo;
        int codigoMaisBaixo = codigo;
        int codigoMaisGordo = codigo;
        int codigoMaisMagro = codigo;

        double alturaMaisAlto = altura;
        double alturaMaisBaixo = altura;
        double alturaMaisGordo = altura;
        double alturaMaisMagro = altura;

        double pesoMaisAlto = peso;
        double pesoMaisBaixo = peso;
        double pesoMaisGordo = peso;
        double pesoMaisMagro = peso;

        while (codigo != 0) {
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

        System.out.printf("Média das alturas: %.2f\n", (mediaAlturas / quantidadeClientes));
        System.out.printf("Média dos pesos: %.2f", (mediaPesos / quantidadeClientes));
    }
}