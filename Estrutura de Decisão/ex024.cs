/*

24. Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é:

    a. par ou ímpar;
    b. positivo ou negativo;
    c. inteiro ou decimal.

*/

double num1, num2, resultado = 0;
char op_matematica;

Console.WriteLine("Primeiro número: ");
num1 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Segundo número: ");
num2 = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Qual operação matemática deseja realizar?");
Console.WriteLine("SOMA (+) | SUBTRAÇÃO (-) | MULTIPLICAÇÃO (*) | DIVISÃO (/)");

op_matematica = Convert.ToChar(Console.ReadLine());

switch (op_matematica)
{
    case '+':
        resultado = num1 + num2;
        break;
    case '-':
        resultado = num1 - num2;
        break;
    case '*':
        resultado = num1 * num2;
        break;
    case '/':
        resultado = num1 / num2;
        break;
}

Console.WriteLine("Resultado da operação: " + num1 + " " + op_matematica + " " + num2 + " = " + resultado);

if (resultado / 2 == 0)
{
    Console.WriteLine(resultado + " é um número par.");
}
else
{
    Console.WriteLine(resultado + " é um número ímpar.");
}

if (resultado >= 0)
{
    Console.WriteLine(resultado + " é um número positivo.");
}
else
{
    Console.WriteLine(resultado + " é um número negativo.");
}

if (resultado % 1 == 0)
{
    Console.WriteLine(resultado + " é um número inteiro.");
}
else
{
    Console.WriteLine(resultado + " é um número decimal.");
}