// 6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.

double[] media_alunos = new double[10];

for (int i = 0; i < 10; i++)
{
    Console.WriteLine($"ALUNO {i + 1}");
    
    for (int j = 0; j < 4; j++)
    {
        Console.Write($"{j + 1}ª nota: ");
        media_alunos[i] += Convert.ToDouble(Console.ReadLine());
    }

    media_alunos[i] = media_alunos[i] / 4;

    Console.Clear();
}

Console.WriteLine("ALUNOS COM MÉDIA MAIOR OU IGUAL A 7.0");

for (int i = 0; i < 10; i++)
{
    if (media_alunos[i] >= 7)
    {
        Console.WriteLine($"{i + 1}º aluno teve media {media_alunos[i]:0.##}");
    }
}