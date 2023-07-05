// 5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.

int[] numeros = new int[20];
int[] par = new int[20];
int[] impar = new int[20];

for (int i = 0; i < 20; i++)
{
    Console.Write($"{i + 1}º número: ");
    numeros[i] = Convert.ToInt32(Console.ReadLine());

    if (numeros[i] % 2 == 0)
    {
        par[i] = numeros[i];
    }
    else
    {
        impar[i] = numeros[i];
    }
}

Console.Write("Números digitados: ");

foreach (var numero in numeros)
{
    Console.Write($"{numero} ");
}

Console.Write("\nPares: ");

foreach (var pares in par)
{
    Console.Write($"{pares} ");
}

Console.Write("\nÍmpares: ");

foreach (var impares in impar)
{
    Console.Write($"{impares} ");
}