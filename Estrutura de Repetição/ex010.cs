// 10. Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

int num1, num2;

Console.Write("Digite o primeiro número: ");
num1 = Convert.ToInt32(Console.ReadLine());

Console.Write("Digite o segundo número: ");
num2 = Convert.ToInt32(Console.ReadLine());

for (int i = num1; i <= num2; i++)
{
    Console.WriteLine(i);
}