// 8. Faça um programa que leia 5 números e informe a soma e a média dos números.

double numero, media, soma = 0;

for (int i = 0; i < 5; i++)
{
    Console.Write($"Digite o {i + 1}º número: ");
    numero = Convert.ToInt32(Console.ReadLine());

    soma += numero;
}

media = soma / 5;

Console.WriteLine("A soma dos números é: " + soma);
Console.WriteLine("A média dos números é: " + media);