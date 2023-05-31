// 12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

double altura, peso_ideal;

Console.WriteLine("Qual sua altura? ");
altura = Convert.ToDouble(Console.ReadLine());

peso_ideal = (72 * altura) - 58;

Console.WriteLine("Seu peso ideal seria de: " + peso_ideal + "kg.");