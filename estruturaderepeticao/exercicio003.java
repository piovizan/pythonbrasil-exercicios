package estruturaderepeticao;

import java.util.Scanner;

/**
 * exercicio003
 */
public class exercicio003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do {
            System.out.print("Nome: ");
            nome = scanner.nextLine();

            if (nome.length() < 4)
                System.out.println("O nome precisa ter 4 caracteres ou mais");
        } while (nome.length() < 4);

        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            if (idade < 0 || idade > 150)
                System.out.println("Idade precisa estar entre 0 e 150");
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Salário: ");
            salario = scanner.nextDouble();

            if (salario < 1)
                System.out.println("Salário precisa ser maior que 0");
        } while (salario < 1);

        do {
            System.out.print("Sexo: ");
            sexo = scanner.next().charAt(0);

            if (sexo != 'f' && sexo != 'm')
                System.out.println("Valor inválido");
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.print("Estado civil: ");
            estadoCivil = scanner.next().charAt(0);

            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd')
                System.out.println("Valor inválido");
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
    }
}