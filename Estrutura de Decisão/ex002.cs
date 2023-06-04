// 2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

int valor;

Console.WriteLine("Digite um valor: ");
valor = Convert.ToInt32(Console.ReadLine());

if (valor >= 0)
{
    Console.WriteLine("O valor é POSITIVO");
}
else
{
    Console.WriteLine("O valor é NEGATIVO");
}