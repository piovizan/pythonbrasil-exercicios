// 13. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.

int num1, num2, resultado = 0;

Console.Write("Base: ");
num1 = Convert.ToInt32(Console.ReadLine());

Console.Write("Expoente: ");
num2 = Convert.ToInt32(Console.ReadLine());

for (int i = 0; i < num2; i++)
{
    resultado += num1 * num1;
}

Console.WriteLine("Resultado: " + resultado);