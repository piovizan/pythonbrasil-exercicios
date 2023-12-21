package classes.exercicio02;

/**
 * exercicio002
 */
public class exercicio002 {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();

        quadrado.tamanhoLado = 2;

        System.out.println(quadrado.valorLado());
        System.out.println(quadrado.calculaArea());

        quadrado.mudaLado(6);

        System.out.println("Novo tamanho do lado: " + quadrado.valorLado());
        System.out.println("Novo cálculo da área: " + quadrado.calculaArea());
    }
}