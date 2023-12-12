package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio020
 */
public class exercicio020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int fatorial = 1;
        StringBuilder fatorialString = new StringBuilder();

        boolean encerrar = false;

        while (!encerrar) {
            do {
                System.out.print("Ver fatorial do numero: ");
                num = scanner.nextInt();
    
                if (num < 1)
                    System.out.println("Insira um valor inteiro positivo");
    
                if (num > 15)
                    System.out.println("Insira um valor menor que 16");
            } while (num < 1 || num > 15);
    
            System.out.printf("%d!=", num);
    
            for (int i = num; i > 0; i--) {
                fatorialString.append(i).append(".");
                fatorial *= i;
            }
    
            System.out.print(fatorialString.substring(0, fatorialString.length() - 1));
            System.out.printf("=%d\n", fatorial);

            System.out.print("Desejar sair? [s/n] ");

            if (scanner.next().charAt(0) == 's') {
                encerrar = true;
            } else {
                fatorial = 1;
                fatorialString.delete(0, fatorialString.length() - 1);
            }
        }
    }
}