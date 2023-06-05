// 9. Faça um Programa que leia três números e mostre-os em ordem decrescente.

int num1, num2, num3;
int maior, meio, menor;

Console.WriteLine("1º número: ");
num1 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("2º número: ");
num2 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("3º número: ");
num3 = Convert.ToInt32(Console.ReadLine());

if (num1 > num2 && num1 > num3)
{
    if (num2 > num3)
    {
        maior = num1;
        meio = num2;
        menor = num3;
    }
    else
    {
        maior = num1;
        meio = num3;
        menor = num2;
    }
}
else if (num2 > num1 && num2 > num3)
{
    if (num1 > num3)
    {
        maior = num2;
        meio = num1;
        menor = num3;
    }
    else
    {
        maior = num2;
        meio = num3;
        menor = num1;
    }
}
else
{
    if (num1 > num2)
    {
        maior = num3;
        meio = num1;
        menor = num2;
    }
    else
    {
        maior = num3;
        meio = num2;
        menor = num1;
    }
}

Console.WriteLine(menor + " - " + meio + " - " + menor);