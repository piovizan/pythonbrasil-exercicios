/*

13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
    a. Para homens: (72.7*h) - 58
    b. Para mulheres: (62.1*h) - 44.7

*/

double h, peso_ideal;
char sexo;

Console.WriteLine("Qual sua altura? ");
h = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Qual o seu sexo? (m/f): ");
sexo = Convert.ToChar(Console.ReadLine());

if (sexo == 'm')
{
    peso_ideal = (72.7 * h) - 58;
}
else
{
    peso_ideal = (62.1 * h) - 44.7;
}

Console.WriteLine("Seu peso ideal seria: " + peso_ideal + "kg.");