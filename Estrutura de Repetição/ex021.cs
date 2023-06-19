// 21. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.

int numero;
int cont = 1;

Console.Write("Digite um número: ");
numero = Convert.ToInt32(Console.ReadLine());

for (int i = 1; i < numero; i++)
{
    if (numero % i == 0)
    {
        cont += 1;
    }
}

if (cont == 2)
{
    Console.WriteLine("É PRIMO!");
}
else
{
    Console.WriteLine("NÃO É PRIMO!");
}