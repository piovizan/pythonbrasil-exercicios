// 4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

char[] caracteres = new char[10];

// como não sei a quantidade de consoantes que serão digitadas, vou fazer uma lista no lugar de outro vetor
List<char> consoantes = new List<char>();

for (int i = 0; i < 10; i++)
{
    Console.Write($"{i + 1}º caractere: ");
    caracteres[i] = Convert.ToChar(Console.ReadLine());

    if (caracteres[i] != 'a' && caracteres[i] != 'e' && caracteres[i] != 'i' && caracteres[i] != 'o' && caracteres[i] != 'u')
    {
        consoantes.Add(caracteres[i]);
    }
}

Console.WriteLine($"{consoantes.Count()} consoantes foram lidas.");

foreach (var consoante in consoantes)
{
    Console.WriteLine(consoante);
}