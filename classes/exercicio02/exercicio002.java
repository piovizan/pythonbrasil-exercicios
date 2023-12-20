package classes.exercicio02;

/**
 * exercicio002
 */
public class exercicio002 {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2);

        System.out.println("Valor do lado: " + quadrado.mostraLado());
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        quadrado.mudarLado(6);

        System.out.println("Novo valor do lado: " + quadrado.mostraLado());
        System.out.println("Nova área do quadrado: " + quadrado.calcularArea());
    }
}