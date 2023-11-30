/**
 * 09. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
 * fórmula: (°F − 32) × 5/9
 */
public class exercicio009 {

    public static void main(String[] args) {
        double fahrenheit = 76;
        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
    }
}