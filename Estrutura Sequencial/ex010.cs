// 10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

// Fórmula: (°C × 9/5) + 32 = °F

double celsius, fahrenheit;

Console.WriteLine("Temperatura em graus Celsius: ");
celsius = Convert.ToDouble(Console.ReadLine());

fahrenheit = 32 + ((celsius * 9) / 5);

Console.WriteLine("A temperatura em graus Fahrenheit é: " + fahrenheit + "°F.");