/*
    15. Faça um programa que leia um número indeterminado de valores, correspondentes a notas, encerrando a entrada de dados quando for informado um valor igual a -1 (que não deve ser armazenado). Após esta entrada de dados, faça:
        
        Mostre a quantidade de valores que foram lidos;
        Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
        Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
        Calcule e mostre a soma dos valores;
        Calcule e mostre a média dos valores;
        Calcule e mostre a quantidade de valores acima da média calculada;
        Calcule e mostre a quantidade de valores abaixo de sete;
        Encerre o programa com uma mensagem;
*/

List<double> notas = new List<double>();

double nota;

double soma = 0;
double media = 0;
int acima_media = 0;
int abaixo_sete = 0;

do
{ 
    Console.Write($"Nota: ");
    nota = Convert.ToDouble(Console.ReadLine());

    if (nota == -1)
    {
        break;
    }
    else
    {
        notas.Add(nota);
        soma = soma + nota;
    }
} while (nota != -1);

Console.Clear();

media = soma / notas.Count();

Console.WriteLine("Quantidade de valores lidos: " + notas.Count());
Console.Write("Valores na ordem em que foram informados: ");

foreach (var item in notas)
{
    Console.Write($"{item} ");
}

Console.WriteLine("\nValores na ordem inversa à que foram informados:");

for (int i = 0; i < notas.Count(); i++)
{
    Console.WriteLine(notas[notas.Count() - (i + 1)]);

    // aproveitando pra contar a quantidade de notas acima da média e abaixo de sete
    if (notas[i] > media) acima_media++;
    if (notas[i] < 7) abaixo_sete++;
}

Console.WriteLine($"Soma dos valores: {soma:0.##}");
Console.WriteLine($"Média dos valores: {media:0.##}");
Console.WriteLine("Quantidade de valores acima da média calculada: " + acima_media);
Console.WriteLine("Quantidade de valores abaixo de sete: " + abaixo_sete);
Console.WriteLine("FIM! =)");