// 5. Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

bool fechar = false;

while (fechar == false)
{
    Console.Clear();

    double a, b, taxaA, taxaB;
    int anos = 0;

    Console.Write("Informe o número de habitantes do país A: ");
    a = Convert.ToDouble(Console.ReadLine());

    while (a < 0)
    {
        Console.Write("O número de habitantes do país A precisa ser maior que 0: ");
        a = Convert.ToDouble(Console.ReadLine());
    }

    Console.Write("Taxa de crescimento de A (%): ");
    taxaA = Convert.ToDouble(Console.ReadLine());

    Console.Write("Informe o número de habitantes do país B: ");
    b = Convert.ToDouble(Console.ReadLine());

    while (b < 0)
    {
        Console.Write("O número de habitantes do país B precisa ser maior que 0: ");
        b = Convert.ToDouble(Console.ReadLine());
    }

    Console.Write("Taxa de crescimento de B (%): ");
    taxaB = Convert.ToDouble(Console.ReadLine());

    if (taxaA < taxaB)
    {
        Console.WriteLine("Para A ultrapassar B, A precisa ter a taxa de crescimento maior que a de B");

        Console.Write("Informe outro valor para a taxa de crescimento de A: ");
        taxaA = Convert.ToDouble(Console.ReadLine());
    }

    while (a <= b)
    {
        a += (a * taxaA) / 100;
        b += (b * taxaB) / 100;

        anos += 1;
    }

    Console.WriteLine("O país A levará " + anos + " anos para ultrapassar ou igualar a população do país B.");

    Console.WriteLine("Deseja repetir a operação? (s/n)");

    if (Console.ReadLine() == "n")
    {
        fechar = true;
    }
}
