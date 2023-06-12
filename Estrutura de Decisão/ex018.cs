// 18. Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.

string data;
int dia, mes, ano;

bool data_valida = false;

Console.WriteLine("Digite uma data no formato dd/mm/aaaa: ");
data = Console.ReadLine();

dia = Convert.ToInt32(data.Substring(0, 2));
mes = Convert.ToInt32(data.Substring(3, data.Length - 8));
ano = Convert.ToInt32(data.Substring(6));

if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
{
    if (dia >= 1 && dia <= 31)
    {
        data_valida = true;
    }
}
else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
{
    if (dia >= 1 && dia <= 30)
    {
        data_valida = true;
    }
}
else if (mes == 2)
{
    if (ano % 4 == 0 && dia >= 1 && dia <= 29)
    {
        data_valida = true;
    }
    else if (dia >= 1 && dia <= 28)
    {
        data_valida = true;
    }
}

if (data_valida)
{
    Console.WriteLine("Data válida.");
}
else
{
    Console.WriteLine("Data inválida.");
}