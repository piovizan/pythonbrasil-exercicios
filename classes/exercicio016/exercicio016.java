package classes.exercicio016;

import java.util.Scanner;

public class exercicio016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tamagotchi tamagotchi = new Tamagotchi();

        System.out.print("Nome do seu bichinho: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do seu bichinho: ");
        int idade = scanner.nextInt();

        tamagotchi.setNome(nome);
        tamagotchi.setIdade(idade);

        int acao;

        do {
            tamagotchi.checaFome();

            System.out.println("INFORMAÇÕES SOBRE SEU BICHINHO");

            System.out.println("Nome: " + tamagotchi.getNome());
            System.out.println("Idade: " + tamagotchi.getIdade());
            System.out.println("Humor: " + humor(tamagotchi.getFome(), tamagotchi.getSaude()));
            System.out.println("Fome: " + tamagotchi.getFome());
            System.out.println("Saúde: " + tamagotchi.getSaude());

            System.out.print("Ações: [1 - alimentar] [2 - brincar] [3 - mudar nome] [4 - mudar idade] ");
            acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    System.out.print("Quanta comida você deu ao bichinho? ");
                    int quantidade = scanner.nextInt();

                    tamagotchi.alimentar(quantidade);
                    break;
                case 2:
                    System.out.print("Por quanto tempo você brincou? (em horas): ");
                    int tempo = scanner.nextInt();

                    tamagotchi.brincar(tempo);
                    break;
                case 3:
                    scanner.nextLine();

                    System.out.print("Novo nome: ");
                    nome = scanner.nextLine();

                    tamagotchi.setNome(nome);
                    break;
                case 4:
                    System.out.print("Nova idade: ");
                    idade = scanner.nextInt();

                    tamagotchi.setIdade(idade);
                    break;
                case 8:
                    tamagotchi.str();
                    break;
                default:
                    System.out.println("Ação inválida!");
                    break;
            }
        } while (tamagotchi.getSaude() != 0);
    }

    static String humor(int fome, int saude) {
        String humor = "";

        if (fome < 10 && saude == 100)  
            humor = "Feliz";
        
        if (fome >= 10 && fome < 50)
            humor = "Pouca fome";
        
        if (fome >= 50)
            humor = "Faminto";

        if (saude < 100)
            humor = "Doente";
        
        if (saude == 0)
            humor = "Morto";

        return humor;
    }
}
