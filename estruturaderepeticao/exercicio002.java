package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio002
 */
public class exercicio002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome de usuário: ");
        String usuario = scanner.nextLine();
        String senha;

        do {
            System.out.print("Senha: ");
            senha = scanner.nextLine();

            if (senha.equals(usuario))
                System.out.println("A senha não pode ser igual ao nome de usuário!");
        } while (senha.equals(usuario));
    }
}