package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio010
 */
public class exercicio010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Em qual turno você estuda?\n(M-matutino/V-Verspertino/N-Noturno):");
        char turno = scanner.next().charAt(0);

        switch (turno) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }
    }
}