package estruturadedecisao;
import java.lang.Math;
import java.util.Scanner;;

/**
 * exercicio016
 */
public class exercicio016 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de a: ");
        double a = scanner.nextDouble(); // 1

        if (a == 0) {
            System.out.println("A equação não é de segundo grau");
        } else {
            System.out.print("Valor de b: ");
            double b = scanner.nextDouble(); // -3

            System.out.print("Valor de c: ");
            double c = scanner.nextDouble(); // -10

            double delta = Math.pow(b, 2) - 4 * a * c;
            double x = ((-(b)) + Math.sqrt(delta)) / (2 * a);
            double y = ((-(b)) - Math.sqrt(delta)) / (2 * a);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("A equação possui apenas uma raiz real:");
                System.out.println(x);
            } else {
                System.out.println("A equação possui duas raízes reais:");
                System.out.println(x);
                System.out.println(y);
            }
        }
    }
}