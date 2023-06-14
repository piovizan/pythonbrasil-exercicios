// 23. Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.

double numero;

Console.WriteLine("Digite um número: ");
numero = Convert.ToDouble(Console.ReadLine());

if (numero % 1 == 0)
{
    Console.WriteLine("Inteiro");
}
else
{
    Console.WriteLine("Decimal");
}