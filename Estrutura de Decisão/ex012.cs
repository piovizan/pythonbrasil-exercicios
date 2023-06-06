/*

12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
    
    Desconto do IR:
    - Salário Bruto até 900 (inclusive) - isento
    - Salário Bruto até 1500 (inclusive) - desconto de 5%
    - Salário Bruto até 2500 (inclusive) - desconto de 10%
    - Salário Bruto acima de 2500 - desconto de 20%
    
    Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00  
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00

*/

double valor_hora, horas_trabalhadas;
double salario_bruto, salario_liquido;
double ir, inss, fgts, descontos;

Console.WriteLine("Valor ganho por hora: ");
valor_hora = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Horas trabalhadas no mês: ");
horas_trabalhadas = Convert.ToDouble(Console.ReadLine());

salario_bruto = valor_hora * horas_trabalhadas;

Console.WriteLine("Salário Bruto : R$ " + salario_bruto);

// Desconto do Imposto de Renda
if (salario_bruto <= 900)
{
    ir = 0;
}
else if (salario_bruto > 900 && salario_bruto <= 1500)
{
    ir = salario_bruto * (5 / 100);
}
else if (salario_bruto > 1500 && salario_bruto <= 2500)
{
    ir = salario_bruto * (10 / 100);
}
else
{
    ir = salario_bruto * (20 / 100);
}

inss = salario_bruto * (10 / 100);
fgts = salario_bruto * (11 / 100);

descontos = ir + inss; // a empresa deposita o fgts, então não é descontado do salário
salario_liquido = salario_bruto - descontos;

Console.WriteLine("Salário Bruto      : R$ " + salario_bruto);
Console.WriteLine("(-) IR             : R$ " + ir);
Console.WriteLine("(-) INSS           : R$ " + inss);
Console.WriteLine("FGTS               : R$ " + fgts);
Console.WriteLine("Total de descontos : R$ " + descontos);
Console.WriteLine("Salário Liquido    : R$ " + salario_liquido);