/**
 * 10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
 * fórmula: (°C × 9/5) + 32
 */
public class exercicio010 {

    public static void main(String[] args) {
        double celsius = 32;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}