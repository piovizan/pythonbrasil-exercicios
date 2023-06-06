/*

11. As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
    Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
    
    - salários até R$ 280,00 (incluindo) : aumento de 20%
    - salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    - salários de R$ 1500,00 em diante : aumento de 5%

    Após o aumento ser realizado, informe na tela:
    - o salário antes do reajuste;
    - o percentual de aumento aplicado;
    - o valor do aumento;
    - o novo salário, após o aumento.

*/

double salario, novo_salario;

Console.WriteLine("Informe o salário: ");
salario = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Salário antes do reajuste: R$" + salario);

if (salario <= 280)
{
    novo_salario = salario * 1.2;
    Console.WriteLine("O percentual de aumento aplicado foi de 20%");
}
else if (salario > 280 && salario < 700)
{
    novo_salario = salario * 1.15;
    Console.WriteLine("O percentual de aumento aplicado foi de 15%");
}
else if (salario > 700 && salario < 1500)
{
    novo_salario = salario * 1.1;
    Console.WriteLine("O percentual de aumento aplicado foi de 10%");
}
else
{
    novo_salario = salario * 1.05;
    Console.WriteLine("O percentual de aumento aplicado foi de 5%");
}

Console.WriteLine("O valor do aumento foi de: R$" + (novo_salario - salario));
Console.WriteLine("Novo salário: R$" + novo_salario);