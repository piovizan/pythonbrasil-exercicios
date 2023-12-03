package estruturadedecisao;

/**
 * exercicio015
 */
public class exercicio015 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 5;

        if ((a > (b + c)) || (b > (a + c)) || (c > (a + b)))
            System.out.println("Não pode ser um triângulo");
        else if ((a == b) && (a == c))
            System.out.println("É um Triângulo Equilátero");
        else if ((a == b) || (b == c) || (a == c))
            System.out.println("É um Triângulo Isósceles");
        else
            System.out.println("É um Triângulo Escaleno");
    }
}