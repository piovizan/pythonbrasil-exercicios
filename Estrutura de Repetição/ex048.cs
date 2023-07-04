/*
    48. Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero invertido.
       
        Exemplo:
        12376489
        => 98467321
*/

int numero;

numero = Convert.ToInt32(Console.ReadLine());

Console.Write("=> ");

for (int i = 1; i <= Convert.ToString(numero).Length; i++)
{
    Console.Write(Convert.ToString(numero)[Convert.ToString(numero).Length - i]);
}