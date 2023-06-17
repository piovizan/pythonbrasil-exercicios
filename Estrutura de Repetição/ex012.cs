/*
 * 12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada
 * A saída deve ser conforme o exemplo abaixo:
 * 
 *      Tabuada de 5:
 *      5 x 1 = 5
 *      5 x 2 = 10
 *      ...
 *      5 x 10 = 50
 */

int numero;

Console.Write("Qual tabuada você deseja ver? ");
numero = Convert.ToInt32(Console.ReadLine());

for (int i = 1; i <= 10; i++)
{
    Console.WriteLine($"{numero} X {i} = {numero * i}");
}