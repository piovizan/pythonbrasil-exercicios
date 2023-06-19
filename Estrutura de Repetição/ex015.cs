// 15. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo.

int n;

int fibonacci = 0;
int a = 0;
int b = 1;

Console.Write("Informe a quantidade de termos que deseja para a sequencia de Fibonacci: ");
n = Convert.ToInt32(Console.ReadLine());

for (int i = 0; i < n; i++)
{
    a = b;
    b = fibonacci;
    fibonacci = a + b;

    Console.Write($"{fibonacci} ");
}