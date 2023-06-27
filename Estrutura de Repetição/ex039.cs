// 39. Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o número do aluno e o segundo representando a sua altura em centímetros. Encontre o aluno mais alto e o mais baixo. Mostre o número do aluno mais alto e o número do aluno mais baixo, junto com suas alturas.

int numero, altura;

int mais_baixo = 500;
int numero_mais_baixo = 0;

int mais_alto = 0;
int numero_mais_alto = 0;

for (int i = 0; i < 10; i++)
{
    Console.Clear();

    Console.Write($"Número do {i + 1}º aluno: ");
    numero = Convert.ToInt32(Console.ReadLine());

    Console.Write($"Altura do {i + 1}º aluno (em cm): ");
    altura = Convert.ToInt32(Console.ReadLine());

    if (altura < mais_baixo)
    {
        mais_baixo = altura;
        numero_mais_baixo = numero;
    }

    if (altura > mais_alto)
    {
        mais_alto = altura;
        numero_mais_alto = numero;
    }
}

Console.Clear();

Console.WriteLine("ALUNO MAIS BAIXO");
Console.WriteLine("Número: " + numero_mais_baixo);
Console.WriteLine("Altura (em cm): " + mais_baixo + "cm");

Console.WriteLine("\nALUNO MAIS ALTO");
Console.WriteLine("Número: " + numero_mais_alto);
Console.WriteLine("Altura (em cm): " + mais_alto + "cm");