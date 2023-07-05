// 3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.

double[] notas = new double[4];
double media = 0;

for (int i = 0; i < 4; i++)
{
    Console.Write($"{i + 1}ª nota: ");
    notas[i] = Convert.ToDouble(Console.ReadLine());

    media += notas[i];
}

Console.WriteLine("Notas:");

foreach (var nota in notas)
{
    Console.WriteLine(nota);
}

Console.WriteLine("Média: " + (media / 4));