// 8. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.

int[] idades = new int[5];
double[] alturas = new double[5];

for (int i = 0; i < 5; i++)
{
    Console.WriteLine($"{i + 1}ª PESSOA");
    
    Console.Write($"Idade: ");
    idades[i] = Convert.ToInt32(Console.ReadLine());

    Console.Write($"Altura: ");
    alturas[i] = Convert.ToDouble(Console.ReadLine());

    Console.Clear();
}

Console.WriteLine("ORDEM LIDA");

Console.Write("Idades: ");

foreach (var idade in idades)
{
    Console.Write($"{idade} ");
}

Console.Write("\nAlturas: ");

foreach (var altura in alturas)
{
    Console.Write($"{altura} ");
}

Console.WriteLine("\nORDEM INVERSA");

Console.Write("Idades: ");

for (int i = 1; i <= 5; i++)
{
    Console.Write($"{idades[idades.Length - i]} ");
}

Console.Write("\nAlturas: ");

for (int i = 1; i <= 5; i++)
{
    Console.Write($"{alturas[alturas.Length - i]} ");
}