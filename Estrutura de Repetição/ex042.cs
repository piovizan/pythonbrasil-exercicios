// 42. Faça um programa que leia uma quantidade indeterminada de números positivos e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deverá terminar quando for lido um número negativo.

int numero;
int i1 = 0; // intervalo [0-25]
int i2 = 0; // intervalo [26-50]
int i3 = 0; // intervalo [51-75]
int i4 = 0; // intervalo [76-100]

do
{
    Console.Write("Digite um número positivo: ");
    numero = Convert.ToInt32(Console.ReadLine());

    if (numero >= 0 && numero <= 25) i1++;
    else if (numero > 25 && numero <= 50) i2++;
    else if (numero > 50 && numero <= 75) i3++;
    else if (numero > 75 && numero <= 100) i4++;
    else break;
} while (numero > 0);

Console.WriteLine($"{i1} números estão entre 0 e 25");
Console.WriteLine($"{i2} números estão entre 26 e 50");
Console.WriteLine($"{i3} números estão entre 51 e 75");
Console.WriteLine($"{i4} números estão entre 76 e 100");