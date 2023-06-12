// 22. Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão).

int numero;

Console.WriteLine("Digite um número inteiro: ");
numero = Convert.ToInt32(Console.ReadLine());

if (numero % 2 == 0)
{
    Console.WriteLine(numero + " é par.");
}
else
{
    Console.WriteLine(numero + " é ímpar.");
}