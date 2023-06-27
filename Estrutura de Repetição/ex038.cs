/*
 * 38. Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
 * 
 *      a. Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
 *      b. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
 *      c. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.
 *      
 *      Faça um programa que determine o salário atual desse funcionário. Após concluir isto, altere o programa permitindo que o usuário digite o salário inicial do funcionário.
 */

int ano = 1995;
int ano_atual;

double salario_inicial;
double salario_atual;

double aumento = 1.5 / 100;

Console.Write("Salário inicial do funcionário em 1995: ");
salario_inicial = Convert.ToDouble(Console.ReadLine());

salario_atual = salario_inicial;

Console.Write("Ano atual: ");
ano_atual = Convert.ToInt32(Console.ReadLine());

while (ano < ano_atual)
{
    salario_atual += salario_atual * aumento;
    aumento *= 2;
    ano++;
}

Console.WriteLine($"Salário inicial (1995): R${salario_inicial:0.##}");
Console.WriteLine($"Salário atual ({ano_atual}): R${salario_atual:0.##}");