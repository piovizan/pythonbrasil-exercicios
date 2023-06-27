// 35. Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma lista dos números primos existentes entre 1 e um número inteiro informado pelo usuário.

int numero;
int cont = 0;

Console.Write("Digite um número: ");
numero = Convert.ToInt32(Console.ReadLine());

for (int i = 1; i <= numero; i++)
{
    for (int j = 1; j <= i; j++)
    {
        if (i % j == 0) cont++;
    }

    if (cont == 2) Console.WriteLine(i + " é um número primo!");
    
    cont = 0;
}