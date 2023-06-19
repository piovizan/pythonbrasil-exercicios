// 17. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120

int numero;
int fatorial = 1;

Console.Write("Informe um número: ");
numero = Convert.ToInt32(Console.ReadLine());

Console.Write($"{numero}!=");

do
{
    Console.Write($"{numero}");
    fatorial *= numero;
    numero--;
} while (numero > 0);

Console.Write($"=" + fatorial);