// 14. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.

int numeros;
int pares = 0, impares = 0;

for (int i = 0; i < 10; i++)
{
    Console.WriteLine($"Digite o {i + 1}º número: ");
    numeros = Convert.ToInt32(Console.ReadLine());

    if (numeros % 2 == 0)
    {
        pares++;
    }
    else
    {
        impares++;
    }
}

Console.WriteLine("Quantidade de números pares: " + pares);
Console.WriteLine("Quantidade de números ímpares: " + impares);