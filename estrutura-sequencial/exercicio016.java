import java.util.Scanner;
import java.lang.Math;

/**
 * 16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */
public class exercicio016 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamanho em metros quadrados: ");
        double area = scanner.nextDouble();

        double litros = area / 3;
        double latas = Math.ceil(litros / 18);

        double preco = latas * 18;

        System.out.println("Tamanho da área: " + area);
        System.out.println("Quantidade de latas a serem usadas: " + ((int) latas));
        System.out.println("Preço: R$" + preco);
    }
}