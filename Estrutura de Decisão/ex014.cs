/*

14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:

        Média de Aproveitamento  Conceito
        Entre 9.0 e 10.0        A
        Entre 7.5 e 9.0         B
        Entre 6.0 e 7.5         C
        Entre 4.0 e 6.0         D
        Entre 4.0 e zero        E

    O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.

*/

double nota1, nota2, media;
char conceito;

Console.WriteLine("1a nota: ");
nota1 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("2a nota: ");
nota2 = Convert.ToDouble(Console.ReadLine());

media = (nota1 + nota2) / 2;

Console.WriteLine("1a nota do aluno: " + nota1);
Console.WriteLine("2a nota do aluno: " + nota2);
Console.WriteLine("Média: " + media);

if (media >= 9)
{
    conceito = 'A';
}
else if (media >= 7.5 && media < 9)
{
    conceito = 'B';
}
else if (media >= 6 && media < 7.5)
{
    conceito = 'C';
}
else if (media >= 4 && media < 6)
{
    conceito = 'D';
}
else
{
    conceito = 'E';
}

Console.WriteLine("Conceito: " + conceito);

if (conceito == 'A' || conceito == 'B' || conceito == 'C')
{
    Console.WriteLine("APROVADO");
}
else
{
    Console.WriteLine("REPROVADO");
}