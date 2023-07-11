// 13. Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista. Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).

string[] meses = new string[12] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
List<Double> temperaturas = new List<double>();

double media_anual = 0;
int contador = 1;

for (int i = 0; i < 12; i++)
{
    Console.Write($"Temperatura média de {meses[i]}: ");
    temperaturas.Add(Convert.ToDouble(Console.ReadLine()));

    media_anual += temperaturas[i];
}

Console.Clear();

media_anual = media_anual / 12;

Console.WriteLine($"Temperatura médial anual: {media_anual:0.##}°C.");
Console.WriteLine("Temperaturas acima da média anual:");

for (int i = 0; i < 12; i++)
{
    if (temperaturas[i] > media_anual)
    {
        Console.WriteLine($"{contador} - {meses[i]} {temperaturas[i]}°C");
        contador++;
    }
}