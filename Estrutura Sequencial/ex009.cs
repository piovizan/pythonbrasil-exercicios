// 9. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

// Fórmula: C = 5 * ((F-32) / 9).

double fahrenheit, celsius;

Console.WriteLine("Temperatura em graus Fahrenheit: ");
fahrenheit = Convert.ToDouble(Console.ReadLine());

celsius = 5 * ((fahrenheit - 32) / 9);

Console.WriteLine("A temperatura em graus Celsius é: " + celsius + "°C.");