// 8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

double valor1, valor2, valor3;

Console.WriteLine("Preço do 1º produto: ");
valor1 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Preço do 2º produto: ");
valor2 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Preço do 3º produto: ");
valor3 = Convert.ToDouble(Console.ReadLine());

if (valor1 < valor2 && valor1 < valor3)
{
    Console.WriteLine("O 1º produto é mais barato");
}
else if (valor2 < valor1 && valor2 < valor3)
{
    Console.WriteLine("O 2º produto é mais barato");
}
else
{
    Console.WriteLine("O 3º produto é mais barato");
}