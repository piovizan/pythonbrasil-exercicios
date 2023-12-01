package estruturadedecisao;
import java.util.Scanner;

/**
 * exercicio002
 */
public class exercicio002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0)
            System.out.println("Positivo");
        else
            System.out.println("Negativo");
    }
}