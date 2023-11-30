import java.util.Scanner;
import java.lang.Math;
/**
 * 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 * fórmula: a = pi * r²
 * (obs. vou usar a classe Math pra obter o valor de pi e calcular a potencia do raio)
 */
public class exercicio006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Raio (metros): ");
        double r = scanner.nextDouble();

        double area = (Math.PI * Math.pow(r, 2));

        System.out.println("Área: " + area + "m²");
    }
    
}