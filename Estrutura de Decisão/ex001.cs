// Faça um Programa que peça dois números e imprima o maior deles.

int num1, num2;

Console.WriteLine("Digite um número: ");
num1 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Digite outro número: ");
num2 = Convert.ToInt32(Console.ReadLine());

if (num1 > num2)
{
    Console.WriteLine("O maior número é: " + num1);
}
else
{
    Console.WriteLine("O maior número é: " + num2);
}