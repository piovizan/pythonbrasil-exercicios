// Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

char letra;

Console.WriteLine("Digite uma letra: ");
letra = Convert.ToChar(Console.ReadLine());

if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
{
    Console.WriteLine("A letra " + letra + " é VOGAL");
}
else
{
    Console.WriteLine("A letra " + letra + " é CONSOANTE");
}