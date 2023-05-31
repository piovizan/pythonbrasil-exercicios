/*

15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

    a. salário bruto.
    b. quanto pagou ao INSS.
    c. quanto pagou ao sindicato.
    d. o salário líquido.
    e. calcule os descontos e o salário líquido, conforme a tabela abaixo:

    + Salário Bruto : R$
    - IR (11%) : R$
    - INSS (8%) : R$
    - Sindicato ( 5%) : R$
    = Salário Liquido : R$

    Obs.: Salário Bruto - Descontos = Salário Líquido.

*/

// Ler valor ganho por hora e número de horas trabalhadas no mês
// Descontar 11% para o Imposto de Renda
// Descontar 8% para o INSS
// Descontar 5% para o sindicato
// Imprimir resultados

double valor_hora, horas_trabalhadas;
double salario, salario_liquido;
double ir, inss, sindicato, descontos;

Console.WriteLine("Valor ganho por hora: ");
valor_hora = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Horas trabalhadas no mês: ");
horas_trabalhadas = Convert.ToDouble(Console.ReadLine());

salario = valor_hora * horas_trabalhadas;

ir = (11 * salario) / 100;
inss = (8 * salario) / 100;
sindicato = (5 * salario) / 100;

descontos = ir + inss + sindicato;

salario_liquido = salario - descontos;

Console.WriteLine("+ Salário Bruto : R$" + salario);
Console.WriteLine("- IR (11%) : R$" + ir);
Console.WriteLine("- INSS (8%) : R$" + inss);
Console.WriteLine("- Sindicato (5%) : R$" + sindicato);
Console.WriteLine("= Salário Liquido : R$" + salario_liquido);