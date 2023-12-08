package funcoes;

import java.util.Random;
import java.util.Scanner;

/**
 * exercicio010
 */
public class exercicio010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean encerra = false;
        
        int jogada = 0;
        int valor;
        int ponto = 0;

        while (!encerra) {
            System.out.print("Aperte (j) para lançar os dados... ");
            if (scanner.next().charAt(0) == 'j') {
                jogada++;

                valor = lancaDados();
                System.out.println(valor);

                if (jogada == 1) {
                    if (valor == 7 || valor == 11) {
                        System.out.println("UAU! De primeira!");
                        System.out.println("Você tirou um natural e ganhou!");
                        break;
                    } else if (valor == 2 || valor == 3 || valor == 12) {
                        System.out.println("CRAPS! Você perdeu!");
                        break;
                    } else {
                        ponto = valor;
                        System.out.println("Seu ponto é: " + ponto);
                    }
                } else {
                    if (valor == 7) {
                        System.out.println("Você perdeu!");
                        break;
                    } else if (valor == ponto) {
                        System.out.println("Você ganhou!");
                        break;
                    }
                }
            }
        }
    }
    static int lancaDados() {
        Random random = new Random();
        
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int somaDosDados = dado1 + dado2;        

        return somaDosDados;
    }
}