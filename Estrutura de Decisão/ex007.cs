// 7. Faça um Programa que leia três números e mostre o maior e o menor deles.

int num1, num2, num3;
int maior, menor;

Console.WriteLine("Primeiro número: ");
num1 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Segundo número: ");
num2 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Terceiro número: ");
num3 = Convert.ToInt32(Console.ReadLine());

if (num1 > num2 && num1 > num3)
{
    maior = num1;
    
    if (num2 > num3)
    {
        menor = num3;
    }
    else
    {
        menor = num2;
    }
}
else if (num2 > num1 && num2 > num3)
{
    maior = num2;

    if (num1 > num3)
    {
        menor = num3;
    }
    else
    {
        menor = num1;
    }
}
else
{
    maior = num3;
    
    if (num1 > num2)
    {
        menor = num2;
    }
    else
    {
        menor = num1;
    }
}

Console.WriteLine("Maior número: " + maior);
Console.WriteLine("Menor número: " + menor);