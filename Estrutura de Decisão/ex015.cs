/*

15. Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.

    Dicas:
    - Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
    - Triângulo Equilátero: três lados iguais;
    - Triângulo Isósceles: quaisquer dois lados iguais;
    - Triângulo Escaleno: três lados diferentes;

*/

int lado1, lado2, lado3;

Console.WriteLine("1º lado: ");
lado1 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("2º lado: ");
lado2 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("3º lado: ");
lado3 = Convert.ToInt32(Console.ReadLine());

if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1))
{
    Console.WriteLine("Pode ser um triângulo");

    if (lado1 == lado2 && lado1 == lado3)
    {
        Console.WriteLine("Triângulo Equilátero: três lados iguais");
    }
    else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
    {
        Console.WriteLine("Triângulo Isósceles: quaisquer dois lados iguais");
    }
    else
    {
        Console.WriteLine("Triângulo Escaleno: três lados diferentes");
    }
}
else
{
    Console.WriteLine("Não pode ser um triângulo");	
}