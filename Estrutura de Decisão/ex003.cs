// 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

char sexo;

Console.WriteLine("Informe seu sexo (F/M): ");
sexo = Convert.ToChar(Console.ReadLine());

if (sexo == 'F')
{
    Console.WriteLine("F - Feminino");
}
else if (sexo == 'M')
{
    Console.WriteLine("M - Masculino");
}
else
{
    Console.WriteLine("Sexo inválido");
}