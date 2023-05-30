// 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

// A fórmula para calcular a área de um círculo é: A = π . r² (Área = PI * Raio²)

double raio, area;

Console.WriteLine("Digite o raio do círculo: ");
raio = Convert.ToDouble(Console.ReadLine());

// Aqui eu utilizo a classe Math para retornar o valor de PI
area = Math.PI * (raio * raio);

Console.WriteLine("A área do círculo é: " + area);