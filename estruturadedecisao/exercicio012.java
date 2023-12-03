package estruturadedecisao;

import java.util.Scanner;

/**
 * exercicio012
 */
public class exercicio012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor da sua hora: R$");
        double valorHora = scanner.nextDouble();

        System.out.println("Horas trabalhadas no mês: R$");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        int irPorcentagem = 0;

        if (salarioBruto <= 900)
            irPorcentagem = 0;
        else if (salarioBruto <= 1500)
            irPorcentagem = 5;
        else if (salarioBruto <= 2500)
            irPorcentagem = 10;
        else
            irPorcentagem = 20;

        double ir = (irPorcentagem * salarioBruto) / 100;
        double inss = (10 * salarioBruto) / 100;
        double fgts = (11 * salarioBruto) / 100;

        double descontos = ir + inss;
        
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR (" + irPorcentagem + ") : R$ " + ir);
        System.out.println("(-) INSS (10%) : R$ " + inss);
        System.out.println(" FGTS (11%) : R$ " + fgts);
        System.out.println("Total de descontos : R$ " + descontos);
        System.out.println("Salário Liquido : R$ " + salarioLiquido);
    }
}