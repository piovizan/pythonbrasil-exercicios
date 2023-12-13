package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio033
 */
public class exercicio033 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean encerra = false;

        int i = 1;

        double temperatura;
        
        double menor;
        double maior;
        double media;

        System.out.printf("%dª temperatura: ", i);
        temperatura = scanner.nextDouble();

        menor = temperatura;
        maior = temperatura;
        media = temperatura;

        while (!encerra) {
            i++;            

            System.out.printf("%dª temperatura: ", i);
            temperatura = scanner.nextDouble();

            if (temperatura > maior)
                maior = temperatura;

            if (temperatura < menor)
                menor = temperatura;

            media += temperatura;

            System.out.print("Deseja continuar? [s/n] ");
            
            if (scanner.next().charAt(0) == 'n')
                encerra = true;
        }

        System.out.println("Menor temperatura : " + menor);
        System.out.println("Maior temperatura : " + maior);
        System.out.printf("Média das temperaturas : %.2f", (media / i));
    }
}