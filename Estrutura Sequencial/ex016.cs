// 16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

double area, litros, latas;

Console.WriteLine("Tamanho da área a ser pintada (m²): ");
area = Convert.ToDouble(Console.ReadLine());

litros = area / 3;

latas = Math.Ceiling(litros / 18);

Console.WriteLine("Quantidade de latas a serem compradas: " + latas);
Console.WriteLine("Preço total: R$ " + (latas * 80));