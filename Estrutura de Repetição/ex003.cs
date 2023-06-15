/*
 * 
 * 3. Faça um programa que leia e valide as seguintes informações:
 * a. Nome: maior que 3 caracteres;
 * b. Idade: entre 0 e 150;
 * c. Salário: maior que zero;
 * d. Sexo: 'f' ou 'm';
 * e. Estado Civil: 's', 'c', 'v', 'd';
 * 
 */

string nome;
int idade;
double salario;
char sexo, estado_civil;

do
{
    Console.Write("Nome: ");
    nome = Console.ReadLine();

    if (nome.Length < 4)
    {
        Console.WriteLine("O nome precisa ter 4 caracteres ou mais");
    }
}
while (nome.Length < 4);

do
{
    Console.Write("Idade: ");
    idade = Convert.ToInt32(Console.ReadLine());

    if (idade < 1 || idade > 150)
    {
        Console.WriteLine("Informe um valor entre 0 e 150");
    }
}
while (idade < 1 && idade > 150);

do
{
    Console.Write("Salário: ");
    salario = Convert.ToDouble(Console.ReadLine());

    if (salario < 1)
    {
        Console.WriteLine("Informe um salário");
    }
}
while (salario < 1);

do
{
    Console.Write("Sexo (f / m): ");
    sexo = Convert.ToChar(Console.ReadLine().ToUpper());

    if (sexo != 'F' && sexo != 'M')
    {
        Console.WriteLine("Valor inválido.");
    }
}
while (sexo != 'F' && sexo != 'M');

do
{
    Console.Write("Estado civil (s/c/v/d): ");
    estado_civil = Convert.ToChar(Console.ReadLine());

    if (estado_civil != 's' && estado_civil != 'c' && estado_civil != 'v' && estado_civil != 'd')
    {
        Console.WriteLine("Valor inválido.");
    }
}
while (estado_civil != 's' && estado_civil != 'c' && estado_civil != 'v' && estado_civil != 'd');