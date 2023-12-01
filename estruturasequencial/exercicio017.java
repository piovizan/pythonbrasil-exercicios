package estruturasequencial;
import java.lang.Math;
import java.util.Scanner;

/**
 * 17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
    
    Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        - comprar apenas latas de 18 litros;
        - comprar apenas galões de 3,6 litros;
        - misturar latas e galões, de forma que o desperdício de tinta seja menor.
    
    Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 */

public class exercicio017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoLata = 80;
        double precoGalao = 25;

        System.out.println("Tamanho da área (m²): ");
        double area = scanner.nextDouble();

        area = area * 1.1; // 10% de folga

        System.out.println("area: " + area);

        double litros = Math.ceil(area / 6);

        double latas = Math.ceil(litros / 18);
        double galoes = Math.ceil(litros / 3.6);

        double misturaLata = (int) (litros / 18);
        double misturaGalao = Math.ceil((litros - (misturaLata * 18)) / 3.6);

        double precoMistura = (misturaLata * precoLata) + (misturaGalao * precoGalao);

        System.out.println("Somente latas de 18 litros: " + ((int) latas) + " - R$" + (precoLata * latas));
        System.out.println("Somente galões de 3,6 litros: " + ((int) galoes) + " - R$" + (precoGalao * galoes));
        System.out.println("Misturando os dois: " + misturaLata + " latas e " + misturaGalao + " galões - R$" + precoMistura);
    }
}