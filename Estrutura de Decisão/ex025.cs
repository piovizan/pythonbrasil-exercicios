/*

25. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

    a. "Telefonou para a vítima?"
    b. "Esteve no local do crime?"
    c. "Mora perto da vítima?"
    d. "Devia para a vítima?"
    e. "Já trabalhou com a vítima?"
    
    O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

*/

string resposta;
int positivamente = 0;

Console.WriteLine("Responda essas perguntas sobre um crime com 'sim' ou 'não'");

Console.WriteLine("Telefonou para a vítima?");
resposta = Console.ReadLine();

if (resposta == "sim")
{
    positivamente += 1;
}

Console.WriteLine("Esteve no local do crime?");
resposta = Console.ReadLine();

if (resposta == "sim")
{
    positivamente += 1;
}

Console.WriteLine("Mora perto da vítima?");
resposta = Console.ReadLine();

if (resposta == "sim")
{
    positivamente += 1;
}

Console.WriteLine("Devia para a vítima?");
resposta = Console.ReadLine();

if (resposta == "sim")
{
    positivamente += 1;
}

Console.WriteLine("Já trabalhou com a vítima?");
resposta = Console.ReadLine();

if (resposta == "sim")
{
    positivamente += 1;
}

if (positivamente <= 2)
{
    Console.WriteLine("Suspeita");
}
else if (positivamente >= 3 && positivamente <= 4)
{
    Console.WriteLine("Cúmplice");
}
else if (positivamente > 4)
{
    Console.WriteLine("Assassino");
}
else
{
    Console.WriteLine("Inocente");
}