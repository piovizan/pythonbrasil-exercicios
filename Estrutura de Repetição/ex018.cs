// 18. Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.

int n;
int menor = 1000, maior = 0, soma = 0;

for (int i = 0; i < 5; i++)
{
    Console.Write($"Digite o {i + 1}º número: ");
    n = Convert.ToInt32(Console.ReadLine());

    soma += n;

    if (n > maior)
    {
        maior = n;
    }

    if (n < menor)
    {
        menor = n;
    }
}

Console.WriteLine("Menor valor: " + menor);
Console.WriteLine("Maior valor: " + maior);
Console.WriteLine("Soma dos valores: " + soma);