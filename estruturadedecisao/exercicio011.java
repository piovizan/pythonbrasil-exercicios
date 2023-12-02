package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio011
 */
public class exercicio011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double reajuste;
        double aumento;

        System.out.println("Salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Salário antes do reajuste : R$" + salario);

        if (salario < 280) {
            aumento = (20 * salario) / 100;
            System.out.println("Percentual de aumento aplicado : 20%");
        } else if (salario >= 280 && salario < 700) {
            aumento = (15 * salario) / 100;
            System.out.println("Percentual de aumento aplicado : 15%");
        } else if (salario >= 700 && salario < 1500) {
            aumento = (10 * salario) / 100;
            System.out.println("Percentual de aumento aplicado : 10%");
        } else {
            aumento = (5 * salario) / 100;
            System.out.println("Percentual de aumento aplicado : 5%");
        }

        reajuste = salario + aumento;

        System.out.println("Valor do aumento : R$" + aumento);
        System.out.println("Novo salário : R$" + reajuste);
    }
}