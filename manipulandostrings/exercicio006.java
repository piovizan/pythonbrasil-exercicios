package manipulandostrings;

import java.util.Scanner;

/**
 * exercicio006
 */
public class exercicio006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Data de nascimento (dd/mm/aaaa): ");
        String data = scanner.nextLine();

        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6, 10));

        String stringMes = null;

        switch (mes) {
            case 1:
                stringMes = "Janeiro";
                break;
            case 2:
                stringMes = "Fevereiro";
                break;
            case 3:
                stringMes = "Março";
                break;
            case 4:
                stringMes = "Abril";
                break;
            case 5:
                stringMes = "Maio";
                break;
            case 6:
                stringMes = "Junho";
                break;
            case 7:
                stringMes = "Julho";
                break;
            case 8:
                stringMes = "Agosto";
                break;
            case 9:
                stringMes = "Setembro";
                break;
            case 10:
                stringMes = "Outubro";
                break;
            case 11:
                stringMes = "Novembro";
                break;
            case 12:
                stringMes = "Dezembro";
                break;
            default:
                break;
        }

        System.out.printf("Você nasceu em %d de %s de %d", dia, stringMes, ano);
    }
}