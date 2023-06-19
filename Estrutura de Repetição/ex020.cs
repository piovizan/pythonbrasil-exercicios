// 20. Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.

bool encerrar = false;

while (!encerrar)
{
    Console.Clear();

    int numero;
    int fatorial = 1;

    Console.Write("Informe um número: ");
    numero = Convert.ToInt32(Console.ReadLine());

    while (numero > 15)
    {
        Console.Write("Informe um número menor que 16: ");
        numero = Convert.ToInt32(Console.ReadLine());
    }

    while (numero < 0)
    {
        Console.Write("Informe um número inteiro positivo: ");
        numero = Convert.ToInt32(Console.ReadLine());
    }

    Console.Write($"{numero}! = ");

    do
    {
        Console.Write($"{numero} ");
        fatorial *= numero;
        numero--;

    } while (numero > 0);

    Console.Write($"= " + fatorial);

    Console.WriteLine("\nCalcular novamente? [s/n] ");

    if (Console.ReadLine() == "n")
    {
        encerrar = true;
    }
}