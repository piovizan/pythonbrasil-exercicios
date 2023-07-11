// 10. Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.

int[] vetor1 = new int[10];
int[] vetor2 = new int[10];
int[] vetor3 = new int[20];

int contador = 0;

Console.WriteLine("PRIMEIRO VETOR");

for (int i = 0; i < 10; i++)
{
    Console.Write($"{i + 1}º número: ");
    vetor1[i] = Convert.ToInt32(Console.ReadLine());
}

Console.Clear();

Console.WriteLine("SEGUNDO VETOR");

for (int i = 0; i < 10; i++)
{
    Console.Write($"{i + 1}º número: ");
    vetor2[i] = Convert.ToInt32(Console.ReadLine());
}

Console.Clear();

for (int i = 0; i < 10; i++)
{
    vetor3[contador] = vetor1[i];
    contador++;
    vetor3[contador] = vetor2[i];
    contador++;
}

Console.WriteLine("PRIMEIRO VETOR");

foreach (var item in vetor1)
{
    Console.Write($"{item} ");
}

Console.WriteLine("\nSEGUNDO VETOR");

foreach (var item in vetor2)
{
    Console.Write($"{item} ");
}

Console.WriteLine("\nTERCEIRO VETOR");

foreach (var item in vetor3)
{
    Console.Write($"{item} ");
}