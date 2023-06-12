// 17. Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.

int ano;

Console.WriteLine("Informe um ano: ");
ano = Convert.ToInt32(Console.ReadLine());

if (ano % 4 != 0)
{
    Console.WriteLine(ano + " não é um ano bissexto.");
}
else
{
    Console.WriteLine(ano + " é um ano bissexto.");
}