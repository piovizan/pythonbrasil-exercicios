/*
    47. Em uma competição de ginástica, cada atleta recebe votos de sete jurados. A melhor e a pior nota são eliminadas. A sua nota fica sendo a média dos votos restantes. Você deve fazer um programa que receba o nome do ginasta e as notas dos sete jurados alcançadas pelo atleta em sua apresentação e depois informe a sua média, conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a média com as notas restantes). As notas não são informados ordenadas. Um exemplo de saída do programa deve ser conforme o exemplo abaixo:

    Atleta: Aparecido Parente
    Nota: 9.9
    Nota: 7.5
    Nota: 9.5
    Nota: 8.5
    Nota: 9.0
    Nota: 8.5
    Nota: 9.7

    Resultado final:
    Atleta: Aparecido Parente
    Melhor nota: 9.9
    Pior nota: 7.5
    Média: 9,04
*/

string nome;
double nota;

double melhornota = 0;
double piornota = 10;
double media = 0;

Console.Write("Nome do atleta: ");
nome = Console.ReadLine();

for (int i = 0; i < 7; i++)
{
    Console.Write("Nota: ");
    nota = Convert.ToDouble(Console.ReadLine());

    if (nota > melhornota) melhornota = nota;
    if (nota < piornota) piornota = nota;

    media += nota;
}

media -= melhornota;
media -= piornota;
media /= 5;

Console.WriteLine("\nResultado final:");
Console.WriteLine("Atleta: " + nome);
Console.WriteLine("Melhor nota: " + melhornota);
Console.WriteLine("Pior nota: " + piornota);
Console.WriteLine("Média: " + media);