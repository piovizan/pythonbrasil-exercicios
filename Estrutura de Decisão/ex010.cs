// 10. Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

char turno;

Console.WriteLine("Em que turno você estuda?");
Console.WriteLine("M - Matutino\nV - Vespertino\nN - Noturno");

Console.Write("> ");
turno = Convert.ToChar(Console.ReadLine());

if (turno == 'm')
{
    Console.WriteLine("Bom Dia!");
}
else if (turno == 'v')
{
    Console.WriteLine("Boa Tarde!");
}
else if (turno == 'n')
{
    Console.WriteLine("Boa Noite!");
}
else
{
    Console.WriteLine("Valor Inválido!");
}