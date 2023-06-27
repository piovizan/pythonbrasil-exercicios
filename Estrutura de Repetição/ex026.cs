// 26. Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores. Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.

int eleitores, voto;
int candidato1 = 0, candidato2 = 0, candidato3 = 0;

Console.Write("Total de eleitores: ");
eleitores = Convert.ToInt32(Console.ReadLine());

for (int i = 0; i < eleitores; i++)
{
    Console.Write($"{i + 1}º voto [1 / 2 / 3]: ");
    voto = Convert.ToInt32(Console.ReadLine());

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
    }
}

Console.WriteLine("Total de votos do 1º candidato: " + candidato1);
Console.WriteLine("Total de votos do 2º candidato: " + candidato2);
Console.WriteLine("Total de votos do 3º candidato: " + candidato3);