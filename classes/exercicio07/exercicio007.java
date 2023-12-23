package classes.exercicio07;

import java.util.Scanner;
import java.util.Random;

/**
 * exercicio007
 */
public class exercicio007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tamagotchi tamagotchi = new Tamagotchi();

        int acao;

        System.out.println("Escolha um bichinho: (1)\uD83D\uDC22 (2)\uD83D\uDC12 (3)\uD83D\uDC36 (4)\uD83D\uDC08");

        System.out.print("> ");
        int emoji = scanner.nextInt();

        switch (emoji) {
            case 1:
                tamagotchi.setEmoji("\uD83D\uDC22");
                break;
            case 2:
                tamagotchi.setEmoji("\uD83D\uDC12");
                break;
            case 3:
                tamagotchi.setEmoji("\uD83D\uDC36");
                break;
            case 4:
                tamagotchi.setEmoji("\uD83D\uDC08");
                break;
            case 5:
                System.out.println("Ação inválida!");
                break;
        }

        scanner.nextLine();

        System.out.println("Qual é o nome do seu bichinho?");

        System.out.print("> ");
        String nome = scanner.nextLine();

        tamagotchi.setNome(nome);

        while (tamagotchi.getSaude() > 0) {
            if (tamagotchi.getFome() == 100)
                tamagotchi.setSaude(-20);

            if (tamagotchi.getFome() == 0) {
                while (tamagotchi.getSaude() < 100) {
                    tamagotchi.setSaude(1);
                }
            }

            if (tamagotchi.getFome() > 100)
                tamagotchi.setFome(-(tamagotchi.getFome() - 100));

            System.out.println("INFORMAÇÕES SOBRE SEU BICHINHO");

            System.out.printf("%-10s%s %s\n", "Nome: ", tamagotchi.getNome(), tamagotchi.getEmoji());
            System.out.printf("%-10s%s\n", "Humor: ", checaHumor(tamagotchi.getFome(), tamagotchi.getSaude()));
            System.out.printf("%-10s%s\n", "Fome: ", tamagotchi.getFome());
            System.out.printf("%-10s%s\n", "Saúde: ", tamagotchi.getSaude());

            System.out.println();
            System.out.println("Ações: [1 - alimentar] [2 - passear] [3 - fazer carinho] [4 - mudar nome]");
            System.out.print("> ");
            acao = scanner.nextInt();

            switch(acao) {
                case 1:
                    if (tamagotchi.getFome() >= 10)
                        tamagotchi.setFome(-10);

                    if (tamagotchi.getFome() == 0)
                        System.out.println("Seu bichinho está cheio!");
                    break;
                case 2:
                    if (tamagotchi.getFome() < 100)
                        tamagotchi.setFome(20);

                    break;
                case 3:
                    if (tamagotchi.getFome() < 100)
                        tamagotchi.setFome(1);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    nome = scanner.nextLine();

                    tamagotchi.setNome(nome);
                    break;
                default:
                    System.out.println("Ação inválida!");
                    break;
            }
        }
    }
    static String checaHumor(int fome, int saude) {
        Random random = new Random();

        String humor = null;
        int n;

        if (fome < 10 && saude == 100) {
            n = random.nextInt(2) + 1;
            if (n == 1)
                humor = "Feliz \uD83D\uDE0A";
            else
                humor = "Triste \uD83D\uDE41";
        }

        if (fome >= 10 && fome < 50)
            humor = "Pouca fome \uD83D\uDE15";

        if (fome >= 50)
            humor = "Faminto \uD83D\uDE29";

        if (saude < 100)
            humor = "Doente \uD83E\uDD12";

        if (saude == 0)
            humor = "Morto \uD83D\uDC80";

        return humor;
    }
}