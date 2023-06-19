// 19. Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.

int n;
int menor = 1000, maior = 0, soma = 0;

for (int i = 0; i < 5; i++)
{
    Console.Write($"Digite o {i + 1}º número: ");
    n = Convert.ToInt32(Console.ReadLine());

    while (n > 1000 || n < 0)
    {
        Console.Write($"Digite um número entre 0 e 1000: ");
        n = Convert.ToInt32(Console.ReadLine());
    }

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