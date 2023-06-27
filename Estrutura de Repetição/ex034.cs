// 34. Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.

int numero;
int cont = 0;

Console.Write("Digite um número: ");
numero = Convert.ToInt32(Console.ReadLine());

for (int i = 1; i <= numero; i++)
{
    if (numero % i == 0) cont++;
}

if (cont == 2)
{
    Console.WriteLine(numero + " é um número primo!");
}
else
{
    Console.WriteLine(numero + " não é um número primo!");
}