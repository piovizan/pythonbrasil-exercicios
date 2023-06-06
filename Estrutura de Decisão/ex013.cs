// 13. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

int dia;

Console.WriteLine("Digite um número e para ver o dia correspondente da semana: ");
dia = Convert.ToInt32(Console.ReadLine());

switch (dia)
{
    case 1:
        Console.WriteLine("1-Domingo");
        break;
    case 2:
        Console.WriteLine("2-Segunda");
        break;
    case 3:
        Console.WriteLine("3-Terça");
        break;
    case 4:
        Console.WriteLine("4-Quarta");
        break;
    case 5:
        Console.WriteLine("5-Quinta");
        break;
    case 6:
        Console.WriteLine("6-Sexta");
        break;
    case 7:
        Console.WriteLine("7-Sábado");
        break;
    default:
        Console.WriteLine("Valor inválido");
        break;
}