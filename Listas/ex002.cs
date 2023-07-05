// 2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.

double[] numeros = new double[10];

for (int i = 0; i < 10; i++)
{
    Console.Write($"{i + 1}º número: ");
    numeros[i] = Convert.ToDouble(Console.ReadLine());
}

for (int i = 9; i >= 0; i--)
{
    Console.WriteLine(numeros[i]);
}