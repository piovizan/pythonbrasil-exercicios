package funcoes;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * exercicio011
 */
public class exercicio011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Data: ");
        String data = scanner.nextLine();

        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6, 10));

        dataPorExtenso(dia, mes, ano);
    }
    static void dataPorExtenso(int dia, int mes, int ano) {
        String[] meses = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" };

        boolean dataValida = false;

        if (mes == 2) {
            if (dia >= 1 && dia <= 28)
                dataValida = true;            
            if (dia == 29 && (ano % 4 == 0))
                dataValida = true;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia >= 1 && dia <= 30)
                dataValida = true;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia >= 1 && dia <= 31)
                dataValida = true;
        }

        if (dataValida)
            System.out.printf("%d de %s de %d", dia, meses[mes -1], ano);
        else
            System.out.println("Data inválida");
    }
}