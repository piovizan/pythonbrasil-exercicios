// 28. Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.

int cds;
double valor_cds = 0;
double media;

Console.Write("Quantidade de CDs: ");
cds = Convert.ToInt32(Console.ReadLine());

for (int i = 0; i < cds; i++)
{
    Console.Write($"Valor do {i + 1}º cd: R$");
    valor_cds += Convert.ToDouble(Console.ReadLine());
}

media = valor_cds / cds;

Console.WriteLine("Valor total investido: R$" + valor_cds);
Console.WriteLine("Valor médio gasto em cada cd: R$" + media);