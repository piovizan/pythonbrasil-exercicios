package classes.exercicio06;

import java.util.Scanner;

/**
 * exercicio006
 * 
 */
public class exercicio006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tv tv = new Tv();

        String button;

        System.out.println(" ______");
        System.out.println("|       |");
        System.out.println("| X     |");
        System.out.println("|       |");
        System.out.println("| -   + |");
        System.out.println("|       |");
        System.out.println("| 1 2 3 |");
        System.out.println("| 4 5 6 |");
        System.out.println("| 7 8 9 |");
        System.out.println("|   0   |");
        System.out.println("|_______|");

        while (true) {
            System.out.println("Número: " + tv.numero);
            System.out.print("> ");
            button = scanner.next();

            if (button.charAt(0) == 'x') break;

            if (button.charAt(0) == '-') {
                tv.diminuirVolume();
                System.out.println("Volume: " + tv.volume);
            }
            
            if (button.charAt(0) == '+') {
                tv.aumentarVolume();
                System.out.println("Volume: " + tv.volume);
            }
            
            if (isNumeric(button) && Integer.parseInt(button) > 0) {
                tv.numero = Integer.parseInt(button);
            }
        }

        scanner.close();
    }
    // checando se foi inserido um valor númerico
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}