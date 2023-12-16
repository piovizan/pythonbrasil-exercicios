package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio042
 */
public class exercicio042 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero >= 0 && numero <= 25)
                a++;
            else if (numero > 25 && numero <= 50)
                b++;
            else if (numero > 50 && numero <= 75)
                c++;
            else if (numero > 75 && numero <= 100)
                d++;
        } while (numero > -1);

        System.out.println(a + " números estão entre 0-25");
        System.out.println(b + " números estão entre 26-50");
        System.out.println(c + " números estão entre 51-75");
        System.out.println(d + " números estão entre 76-100");
    }
}