// 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

double valor_hora, horas_trabalhadas, salario;

Console.WriteLine("Quanto você ganha por hora? ");
valor_hora = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Horas trabalhadas esse mês: ");
horas_trabalhadas = Convert.ToDouble(Console.ReadLine());

salario = valor_hora * horas_trabalhadas;

Console.WriteLine("Seu salário foi de: R$" + salario);