// 25. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

int pessoas, idade = 0;
double media;

Console.Write("Quantidade de pessoas na turma: ");
pessoas = Convert.ToInt32(Console.ReadLine());

for (int i = 0; i < pessoas; i++)
{
    Console.Write($"{i + 1}a. pessoa: ");
    idade += Convert.ToInt32(Console.ReadLine());
}

media = idade / pessoas;

if (media > 0 && media < 25)
{
    Console.WriteLine("A maior parte da turma é jovem!");
}
else if (media > 25 && media < 60)
{
    Console.WriteLine("A maior parte da turma é adulta!");
}
else
{
    Console.WriteLine("A maior parte da turma é idosa!");
}