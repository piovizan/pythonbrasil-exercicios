/*
    14. Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        
        "Telefonou para a vítima?"
        "Esteve no local do crime?"
        "Mora perto da vítima?"
        "Devia para a vítima?"
        "Já trabalhou com a vítima?"
        
        O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
*/

List<char> respostas = new List<char>();
int respostas_positivas = 0;

Console.WriteLine("Responda as perguntas com 's' para sim e 'n' para não");

Console.Write("Telefonou para a vitima? ");
respostas.Add(Convert.ToChar(Console.ReadLine()));

Console.Write("Esteve no local do crime? ");
respostas.Add(Convert.ToChar(Console.ReadLine()));

Console.Write("Mora perto da vítima: ");
respostas.Add(Convert.ToChar(Console.ReadLine()));

Console.Write("Devia para a vítima? ");
respostas.Add(Convert.ToChar(Console.ReadLine()));

Console.Write("Já trabalhou com a vítima? ");
respostas.Add(Convert.ToChar(Console.ReadLine()));

for (int i = 0; i < 5; i++)
{
    if (respostas[i] == 's')
    {
        respostas_positivas++;
    }
}

if (respostas_positivas > 0 && respostas_positivas <= 2)
{
    Console.WriteLine("Suspeita");
}
else if (respostas_positivas > 2 && respostas_positivas <= 4)
{
    Console.WriteLine("Cúmplice");
}
else if (respostas_positivas >= 5)
{
    Console.WriteLine("Assassino");
}
else
{
    Console.WriteLine("Inocente");
}