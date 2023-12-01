package estruturasequencial;
import java.util.Scanner;

/**
 * 15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
    a. salário bruto.
    b. quanto pagou ao INSS.
    c. quanto pagou ao sindicato.
    d. o salário líquido.
    
    calcule os descontos e o salário líquido, conforme a tabela abaixo:

        + Salário Bruto : R$
        - IR (11%) : R$
        - INSS (8%) : R$
        - Sindicato ( 5%) : R$
        = Salário Liquido : R$
    
    Obs.: Salário Bruto - Descontos = Salário Líquido.
 */
public class exercicio015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor ganho por hora: ");
        double ganhoPorHora = scanner.nextDouble();

        System.out.println("Horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = ganhoPorHora * horasTrabalhadas;

        double impostoRenda = (11 * salarioBruto) / 100;
        double inss = (8 * salarioBruto) / 100;
        double sindicato = (5 * salarioBruto) / 100;

        double descontos = impostoRenda + inss + sindicato;

        double salarioLiquido = salarioBruto - descontos;

        System.out.println("+ Salário Bruto : R$" + salarioBruto);
        System.out.println("- IR (11%) : R$" + impostoRenda);
        System.out.println("- INSS (8%) : R$" + inss);
        System.out.println("- Sindicato (5%) : R$" + sindicato);
        System.out.println("= Salário Liquido : R$" + salarioLiquido);
    }
}