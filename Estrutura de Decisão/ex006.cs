// 6. Faça um Programa que leia três números e mostre o maior deles.

int num1, num2, num3;

Console.WriteLine("Primeiro número: ");
num1 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Segundo número: ");
num2 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Terceiro número: ");
num3 = Convert.ToInt32(Console.ReadLine());

if (num1 > num2 && num1 > num3)
{
    Console.WriteLine("O maior número é: " + num1);
}
else if (num2 > num1 && num2 > num3)
{
    Console.WriteLine("O maior número é: " + num2);
}
else
{
    Console.WriteLine("O maior número é: " + num3);
}