/*

17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.

    Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
    - comprar apenas latas de 18 litros;
    - comprar apenas galões de 3,6 litros;
    - misturar latas e galões, de forma que o desperdício de tinta seja menor.
    
    Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

*/

double area, litros, litros_faltando;
double latas, galoes;

Console.WriteLine("Tamanho da área a ser pintada (m²): ");
area = Convert.ToDouble(Console.ReadLine());

litros = (area * 1.1) / 6; // acrescentados 10% de folga

latas = Math.Ceiling(litros / 18);

Console.WriteLine("COMPRANDO APENAS LATAS DE 18 LITROS");
Console.WriteLine("Quantidade de latas a serem usadas: " + latas);
Console.WriteLine("Valor total: R$ " + (latas * 80));

galoes = Math.Ceiling(litros / 3.6);

Console.WriteLine("\nCOMPRANDO APENAS GALÕES DE 3,6 LITROS");
Console.WriteLine("Quantidade de galões a serem usados: " + galoes);
Console.WriteLine("Valor total: R$ " + (galoes * 25));

latas = Math.Floor(litros / 18);
litros_faltando = litros % 18;
galoes = Math.Ceiling(litros_faltando / 3.6);

Console.WriteLine("\nMISTURANDO LATAS E GALÕES");
Console.WriteLine("Quantidade de latas a serem usadas: " + latas);
Console.WriteLine("Quantidade de galões a serem usados: " + galoes);
Console.WriteLine("Valor total: R$ " + ((latas * 80) + (galoes * 25)));