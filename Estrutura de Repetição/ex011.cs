// 11. Altere o programa anterior para mostrar no final a soma dos números.

int num1, num2, soma = 0;

Console.Write("Digite o primeiro número: ");
num1 = Convert.ToInt32(Console.ReadLine());

Console.Write("Digite o segundo número: ");
num2 = Convert.ToInt32(Console.ReadLine());

for (int i = num1; i <= num2; i++)
{
    Console.WriteLine(i);
    soma += i;
}

Console.WriteLine("A soma dos números é: " + soma);