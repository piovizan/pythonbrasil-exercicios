package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio027
 */
public class exercicio027 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade (em Kg) de morangos: ");
        double morangos = scanner.nextDouble();

        System.out.print("Quantidade (em Kg) de maças: ");
        double macas = scanner.nextDouble();

        double frutasKg = morangos + macas;
        double valor = 0;

        if (morangos > 5)
            valor += 2.20 * morangos;
        else 
            valor += 2.50 * morangos;
        
        if (macas > 5)
            valor += 1.50 * macas;
        else
            valor += 1.80 * macas;
        
        if (frutasKg > 8 || valor > 25)
            valor -= (10 * valor) / 100;
        
        System.out.println("Valor: " + valor);
    }
}