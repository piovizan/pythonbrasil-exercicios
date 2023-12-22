package classes.exercicio07;

import java.util.Scanner;

/**
 * exercicio007
 */
public class exercicio007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tamagoshi tamagoshi = new Tamagoshi();

        int acao;

        System.out.print("Qual é o nome do seu bichinho? ");
        String nome = scanner.nextLine();

        tamagoshi.setNome(nome);

        while (true) {
            if (tamagoshi.getSaude() == 0)
                break;
            
            if (tamagoshi.getFome() >= 80)
                tamagoshi.setSaude(-20);

            System.out.println("INFORMAÇÕES SOBRE O SEU BICHINHO");

            System.out.printf("%-10s %s\n", "Nome:", tamagoshi.getNome());
            System.out.printf("%-10s %s\n", "Humor: ", checaHumor(tamagoshi.getFome(), tamagoshi.getSaude()));
            System.out.printf("%-10s %d\n", "Fome: ", tamagoshi.getFome());
            System.out.printf("%-10s %d\n", "Saúde: ", tamagoshi.getSaude());

            System.out.println("\nAções: [1 - alimentar] [2 - passear] [3- fazer carinho] [4 - mudar nome]");
            acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    if (tamagoshi.getFome() >= 2)
                        tamagoshi.setFome(-2);

                    break;
                case 2:
                    if (tamagoshi.getFome() <= 98)
                        tamagoshi.setFome(2);

                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    nome = scanner.nextLine();

                    tamagoshi.setNome(nome);
                    break;
                default:
                    System.out.println("Ação inválida!");
                    break;
            }
        }
    }
    static String checaHumor(int fome, int saude) {
        String humor = "";

        if (fome <= 8 && saude == 100)
            humor = "Feliz";

        if (fome >= 10 && fome <= 48)
            humor = "Pouca fome";
        
        if (fome >= 50 && fome <= 78)
            humor = "Faminto";

        if (saude < 100)
            humor = "Doente";

        if (saude == 0)
            humor = "Morto";

        return humor;
    }
}