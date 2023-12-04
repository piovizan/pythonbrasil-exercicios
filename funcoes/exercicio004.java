package funcoes;

import java.util.Scanner;

/**
 * exercicio004
 */
public class exercicio004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        
        System.out.println(posNeg(num));
    }

    static char posNeg(int num) {
        char result;

        if (num > 0)
            result = 'P';
        else
            result = 'N';
        
        return result;
    }
}