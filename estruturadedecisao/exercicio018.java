package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio018
 */
public class exercicio018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Data: ");
        String data = scanner.nextLine();

        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6, 10));

        boolean dataValida = false;

        if (mes == 2) {
            if (dia >= 1 && dia <= 28) {
                dataValida = true;
            } else if (dia == 29) {
                // testando se o ano é bissexto
                if (ano % 4 == 0)
                    dataValida = true;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // meses com 30 dias
            if (dia >= 1 && dia <= 30)
                dataValida = true;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) { // meses com 31 dias
            if (dia >= 1 && dia <= 31)
                dataValida = true;
        }

        if (!dataValida)
            System.out.println(data + " é uma data inválida");
        else
            System.out.println(data + " é uma data válida");

    }
}