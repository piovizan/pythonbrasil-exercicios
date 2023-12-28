package classes.exercicio017;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Tamagotchi> bichinhos = new ArrayList<>();

        Tamagotchi tamagotchi1 = new Tamagotchi("Tico");
        Tamagotchi tamagotchi2 = new Tamagotchi("Teco");
        Tamagotchi tamagotchi3 = new Tamagotchi("Bob");

        bichinhos.add(tamagotchi1);
        bichinhos.add(tamagotchi2);
        bichinhos.add(tamagotchi3);

        int acao;

        while (true) {
            System.out.println("Seus bichinhos: ");

            for (Tamagotchi bichinho : bichinhos) {
                bichinho.mostrarEstatisticas();
            }

            System.out.println("Ações:");
            System.out.println("[1 - Alimentar bichinhos]");
            System.out.println("[2 - Brincar com os bichinhos]");
            System.out.println("[3 - Mudar nome de um bichinho]");

            System.out.print("> ");
            acao = scanner.nextInt();

            if (acao == 0) break;

            switch (acao) {
                case 1:
                    tamagotchi1.alimentar();
                    tamagotchi2.alimentar();
                    tamagotchi3.alimentar();
                    break;
                case 2:
                    tamagotchi1.brincar();
                    tamagotchi2.brincar();
                    tamagotchi3.brincar();
                    break;
                case 3:
                    for (int i = 0; i < bichinhos.size(); i++) {
                        System.out.printf("%s (%d)\n", bichinhos.get(i).getNome(), (i + 1));
                    }

                    System.out.print("> ");
                    int opcao = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();

                    bichinhos.get(opcao - 1).setNome(novoNome);
                    
                    break;
                default:
                    break;
            }
        }
    }
}