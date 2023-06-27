// 24. Faça um programa que calcule o mostre a média aritmética de N notas.

int notas;
double soma_notas = 0;

Console.Write("Quantas notas deseja calcular? ");
notas = Convert.ToInt32(Console.ReadLine());

for (int i = 0; i < notas; i++)
{
    Console.Write($"{i + 1}a. nota: ");
    soma_notas += Convert.ToDouble(Console.ReadLine());
}

Console.WriteLine("Média: " + (soma_notas / notas));