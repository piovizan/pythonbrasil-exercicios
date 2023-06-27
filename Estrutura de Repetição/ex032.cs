/*
 * 32. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo
 * 
 *      Fatorial de: 5
 *      5! = 5 . 4 . 3 . 2 . 1 = 120
 */

int numero;
int fatorial = 1;
string result = "";

Console.Write("Fatorial de: ");
numero = Convert.ToInt32(Console.ReadLine());

Console.Write($"{numero}! = ");

for (int i = numero; i > 0; i--)
{
    result += Convert.ToString(i) + " . ";
    fatorial *= i;
}

Console.Write(result.Substring(0, result.Length - 2));
Console.Write($"= {fatorial}");