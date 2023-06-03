/*

5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
    - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    - A mensagem "Reprovado", se a média for menor do que sete;
    - A mensagem "Aprovado com Distinção", se a média for igual a dez.

*/

double nota1, nota2, media;

Console.WriteLine("Primeira nota: ");
nota1 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Segunda nota: ");
nota2 = Convert.ToDouble(Console.ReadLine());

media = (nota1 + nota2) / 2;

Console.WriteLine("Média: " + media);

if (media == 10)
{
	Console.WriteLine("Aprovado com Distinção");
}
else if (media >= 7)
{
	Console.WriteLine("Aprovado");
}
else
{
	Console.WriteLine("Reprovado");
}