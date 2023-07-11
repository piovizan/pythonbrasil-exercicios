// 11. Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.

int[] vetor1 = new int[10];
int[] vetor2 = new int[10];
int[] vetor3 = new int[10];

int[] intercala = new int[30];
int contador = 0;

Console.WriteLine("PRIMEIRO VETOR");

for (int i = 0; i < 10; i++)
{
    Console.Write($"{i + 1}º número: ");
    vetor1[i] = Convert.ToInt32(Console.ReadLine());
}

Console.WriteLine("\nSEGUNDO VETOR");

for (int i = 0; i < 10; i++)
{
    Console.Write($"{i + 1}º número: ");
    vetor2[i] = Convert.ToInt32(Console.ReadLine());
}

Console.WriteLine("\nTERCEIRO VETOR");

for (int i = 0; i < 10; i++)
{
    Console.Write($"{i + 1}º número: ");
    vetor3[i] = Convert.ToInt32(Console.ReadLine());
}

Console.Clear();

for (int i = 0; i < 10; i++)
{
    intercala[contador] = vetor1[i];
    contador++;
    intercala[contador] = vetor2[i];
    contador++;
    intercala[contador] = vetor3[i];
    contador++;
}

foreach (var item in intercala)
{
    Console.Write($"{item} ");
}