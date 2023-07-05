// 1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

int[] numeros = new int[5];

for (int i = 0; i < 5; i++)
{
    Console.Write($"{i + 1}º número: ");
    numeros[i] = Convert.ToInt32(Console.ReadLine());
}

foreach (var numero in numeros)
{
    Console.WriteLine(numero);
}