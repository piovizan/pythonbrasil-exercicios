/*

11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    a. o produto do dobro do primeiro com metade do segundo .
    b. a soma do triplo do primeiro com o terceiro.
    c. o terceiro elevado ao cubo.

*/

double num1, num2, num3;
double a, b, c;

Console.WriteLine("Digite um número inteiro: ");
num1 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Digite outro número inteiro: ");
num2 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Digite um número real: ");
num3 = Convert.ToDouble(Console.ReadLine());

a = (num1 * 2) + (num2 / 2);
b = (num1 * 3) + num3;
c = num3 * num3 * num3;

Console.WriteLine(a);
Console.WriteLine(b);
Console.WriteLine(c);