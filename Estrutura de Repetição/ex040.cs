/*
 * 40. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
 *      a. Código da cidade;
 *      b. Número de veículos de passeio (em 1999);
 *      c. Número de acidentes de trânsito com vítimas (em 1999).
 *      
 *      Deseja-se saber:
 *      a. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
 *      b. Qual a média de veículos nas cinco cidades juntas;
 *      c. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
 */

int codigo, veiculos, acidentes;

int menor_indice = 10000; // acho que nenhuma cidade registra 10 mil acidentes de trânsito com vítimas ???
int codigo_menor_indice = 0;

int maior_indice = 0;
int codigo_maior_indice = 0;

int media_veiculos = 0;

int cidade_menos_2mil_veiculos = 0;
int media_acidentes = 0;

for (int i = 0; i < 5; i++)
{
    Console.Clear();

    Console.Write($"Código da {i + 1}ª cidade: ");
    codigo = Convert.ToInt32(Console.ReadLine());

    Console.Write($"Número de veículos de passeio da {i + 1}ª cidade (em 1999): ");
    veiculos = Convert.ToInt32(Console.ReadLine());

    Console.Write($"Número de acidentes de trânsito com vítimas da {i + 1}ª cidade (em 1999): ");
    acidentes = Convert.ToInt32(Console.ReadLine());

    if (acidentes > maior_indice)
    {
        maior_indice = acidentes;
        codigo_maior_indice = codigo;
    }

    if (acidentes < menor_indice)
    {
        menor_indice = acidentes;
        codigo_menor_indice = codigo;
    }

    if (veiculos < 2000)
    {
        media_acidentes += acidentes;
        cidade_menos_2mil_veiculos++;
    }

    media_veiculos += veiculos;
}

media_veiculos /= 5;
media_acidentes /= cidade_menos_2mil_veiculos;

Console.Clear();

Console.WriteLine($"A cidade de código {codigo_maior_indice} tem o maior índice de acidentes de trânsito: {maior_indice} acidentes.");
Console.WriteLine($"\nA cidade de código {codigo_menor_indice} tem o menor índice de acidentes de trânsito: {menor_indice} acidentes.");
Console.WriteLine($"\nA média de veículos nas cinco cidades juntas é de {media_veiculos} veículos.");
Console.WriteLine($"\nA média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é de {media_acidentes} acidentes.");