// 33. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.

bool encerrar = false;

double temperatura;
double maior = -200;
double menor = 200;
double media = 0;

int temperaturas_informadas = 0;

do
{
    Console.Clear();

    Console.Write("Temperatura em graus Celsius °C : ");
    temperatura = Convert.ToDouble(Console.ReadLine());

    temperaturas_informadas++;
    media += temperatura;

    if (temperatura > maior) maior = temperatura;
    if (temperatura < menor) menor = temperatura;

    Console.WriteLine("Digite [s] para encerrar o programa ou qualquer tecla para continuar...");
    if (Console.ReadLine() == "s") encerrar = true;
} while (!encerrar);

media /= temperaturas_informadas;

Console.Clear();

Console.WriteLine("Maior temperatura informada: " + maior + "°C");
Console.WriteLine("Menor temperatura informada: " + menor + "°C");
Console.WriteLine($"Média das temperaturas: {media:0.#}°C");