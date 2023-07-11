// 12. Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.

int[] idades = new int[30];
double[] alturas = new double[30];

double media_altura = 0;
int cont_alunos = 0;

for (int i = 0; i < 30; i++)
{
    Console.Write($"Idade do {i + 1}º aluno: ");
    idades[i] = Convert.ToInt32(Console.ReadLine());

    Console.Write($"Altura do {i + 1}º aluno: ");
    alturas[i] = Convert.ToDouble(Console.ReadLine());

    media_altura += alturas[i];

    Console.Clear();
}

media_altura = media_altura / 5;

for (int i = 0; i < 30; i++)
{
    if (idades[i] > 13)
    {
        if (alturas[i] < media_altura)
        {
            cont_alunos++;
        }
    }
}

Console.WriteLine("Média da altura de todos alunos: " + media_altura);
Console.WriteLine($"{cont_alunos} alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.");