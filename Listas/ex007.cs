// 7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.

int[] numeros = new int[5];
int soma = 0;
int multiplicacao = 1;

for (int i = 0; i < numeros.Length; i++)
{
    Console.Write($"{i + 1}º número: ");
    numeros[i] = Convert.ToInt32(Console.ReadLine());

    soma += numeros[i];
    multiplicacao *= numeros[i];
}

Console.WriteLine("Soma de todos os números: " + soma);
Console.WriteLine("Multiplicação de todos os números: " + multiplicacao);

Console.Write("Números digitados: ");

foreach (var numero in numeros)
{
    Console.Write($"{numero} ");
}