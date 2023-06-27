// 22. Altere o programa de cálculo dos números primos, informando, caso o número não seja primo, por quais número ele é divisível.

int numero;
int cont = 0;

Console.Write("Digite um número: ");
numero = Convert.ToInt32(Console.ReadLine());

for (int i = 1; i <= numero; i++)
{
    if (numero % i == 0)
    {
        cont++;
        Console.WriteLine("É divisivel por " + i);
    }
}

if (cont == 2)
{
    Console.WriteLine("É PRIMO!");
}
else
{
    Console.WriteLine("NÃO É PRIMO!");
}