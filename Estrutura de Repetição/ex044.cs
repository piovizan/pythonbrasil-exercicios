/*
 * 44. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código. Os códigos utilizados são:
 * 
 *      1, 2, 3, 4 - Votos para os respectivos candidatos 
 *      (você deve montar a tabela ex: 1 - Jose / 2 - João / etc)
 *      5 - Voto Nulo
 *      6 - Voto em Branco
 *      
 *      Faça um programa que calcule e mostre:
 *      - O total de votos para cada candidato;
 *      - O total de votos nulos;
 *      - O total de votos em branco;
 *      - A percentagem de votos nulos sobre o total de votos;
 *      - A percentagem de votos em branco sobre o total de votos.
 *      
 *      Para finalizar o conjunto de votos tem-se o valor zero.
 */

double voto;
double total_votos = 0;

double candidato1 = 0;
double candidato2 = 0;
double candidato3 = 0;
double candidato4 = 0;

double votos_nulos = 0;
double votos_brancos = 0;

double percentual_nulos;
double percentual_brancos;

do
{
    Console.Clear();

    Console.WriteLine("ELEIÇÃO PRESIDENCIAL");
    Console.WriteLine("1 - José\n2 - João\n3 - Pedro\n4 - Guilherme\n5 - Voto Nulo\n6 - Voto em Branco\n");

    Console.Write("Voto: ");
    voto = Convert.ToDouble(Console.ReadLine());

    switch (voto)
    {
        case 1:
            candidato1++;
            break;
        case 2:
            candidato2++;
            break;
        case 3:
            candidato3++;
            break;
        case 4:
            candidato4++;
            break;
        case 5:
            votos_nulos++;
            break;
        case 6:
            votos_brancos++;
            break;
        default:
            Console.WriteLine("Opção inválida!");
            break;
    }

    if (voto >= 1 && voto <= 6) total_votos++;
} while (voto != 0);

Console.Clear();

Console.WriteLine("Candidado José - " + candidato1 + " votos");
Console.WriteLine("Candidado João - " + candidato2 + " votos");
Console.WriteLine("Candidado Pedro - " + candidato3 + " votos");
Console.WriteLine("Candidado Guilherme - " + candidato4 + " votos");

Console.WriteLine("\nVotos nulos: " + votos_nulos);
Console.WriteLine("Votos em branco: " + votos_brancos);

percentual_nulos = (votos_nulos / 100) * total_votos;
Console.WriteLine($"\nPercentagem de votos nulos sobre o total de votos: {percentual_nulos:0.##}%");

percentual_brancos = (votos_brancos / 100) * total_votos;
Console.WriteLine($"Percentagem de votos em branco sobre o total de votos: {percentual_brancos:0.##}%");