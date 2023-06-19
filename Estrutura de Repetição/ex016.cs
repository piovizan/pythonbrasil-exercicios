// 16. A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja maior que 500.

int fibonacci = 0;
int a, b = 1;

do
{
    a = b;
    b = fibonacci;
    fibonacci = a + b;

    Console.Write($"{fibonacci} ");
} while (fibonacci < 500);