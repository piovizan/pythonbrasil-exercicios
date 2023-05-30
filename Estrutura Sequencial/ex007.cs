// 07. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

// Fórmula: A = b . h (Área = Base * Altura)
// Como o quadrado tem lados iguais, basta pegar a medida de um dos lados e elevar ao quadrado.

double lados, area;

Console.WriteLine("Digite o lado do quadrado (cm): ");
lados = Convert.ToDouble(Console.ReadLine());

area = lados * lados;

Console.WriteLine("A área desse quadrado será de: " + area + "cm.");