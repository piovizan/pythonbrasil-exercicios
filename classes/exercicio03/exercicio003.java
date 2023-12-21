package classes.exercicio03;

/**
 * exercicio003
 */
public class exercicio003 {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.ladoA = 40;
        retangulo.ladoB = 15;

        System.out.println("Valor dos lados: " + retangulo.valorLados());
        System.out.println("Cálculo da área: " + retangulo.calcularArea());
        System.out.println("Cálculo do períneo: " + retangulo.calcularPerimetro());
    }
}