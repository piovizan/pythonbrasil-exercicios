/*

20. Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
    
    a. A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
    b. A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
    c. A mensagem "Aprovado com Distinção", se a média for igual a 10.

*/

double nota1, nota2, nota3, media;

Console.WriteLine("1a. nota: ");
nota1 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("2a. nota: ");
nota2 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("3a. nota: ");
nota3 = Convert.ToDouble(Console.ReadLine());

media = (nota1 + nota2 + nota3) / 3;

Console.WriteLine("Média: " + media);

if (media >= 7)
{
    Console.WriteLine("Aprovado");
}
else if (media == 10)
{
    Console.WriteLine("Aprovado com Distinção");
}
else
{
    Console.WriteLine("Reprovado");
}