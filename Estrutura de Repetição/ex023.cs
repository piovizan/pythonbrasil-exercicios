// 23. Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos. Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.

int n;
int cont = 0;

Console.Write("Digite um número: ");
n = Convert.ToInt32(Console.ReadLine());

for (int i = 1; i <= n; i++)
{
    for (int j = 1; j <= i; j++)
    {
        if (i % j == 0)
        {
            cont++;
        }
    }

    if (cont == 2)
    {
        Console.WriteLine(i + " é primo");
    }

    cont = 0;
}