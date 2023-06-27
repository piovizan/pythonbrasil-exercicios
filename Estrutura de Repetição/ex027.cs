// 27. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.

int turmas, alunos;
int media = 0;

Console.Write("Quantidade de turmas: ");
turmas = Convert.ToInt32(Console.ReadLine());

for (int i = 0; i < turmas; i++)
{
    Console.Clear();

    Console.WriteLine("TURMA " + (i + 1));

    Console.Write("Quantidade de alunos: ");
    alunos = Convert.ToInt32(Console.ReadLine());

    while (alunos > 40)
    {
        Console.WriteLine("As turmas não podem ter mais de 40 anos!");

        Console.Write("Quantidade de alunos: ");
        alunos = Convert.ToInt32(Console.ReadLine());
    }

    media += alunos / turmas;

    alunos = 0;
}

Console.Clear();

Console.WriteLine("Média de alunos por turma: " + media + " alunos.");