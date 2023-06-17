// 7. Faça um programa que leia 5 números e informe o maior número.

int numero, maior = 0;

for (int i = 0; i < 5; i++)
{
    Console.Write($"Digite o {i + 1}º número: ");
    numero = Convert.ToInt32(Console.ReadLine());

    if (numero > maior)
    {
        maior = numero;
    }
}

Console.WriteLine("O maior número foi: " + maior);