/*

26. Um posto está vendendo combustíveis com a seguinte tabela de descontos:

    Álcool:
    a. até 20 litros, desconto de 3% por litro
    b. acima de 20 litros, desconto de 5% por litro
    
    Gasolina:
    a. até 20 litros, desconto de 4% por litro
    b. acima de 20 litros, desconto de 6% por litro
    
    Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.

*/

double litros_vendidos, valor = 0;
char combustivel;

Console.WriteLine("Litros vendidos: ");
litros_vendidos = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Tipo de combustível (A-álcool, G-gasolina)");
combustivel = Convert.ToChar(Console.ReadLine().ToUpper());

// fórmula: valor do desconto = preço original x (porcentagem de desconto / 100%)

switch (combustivel)
{
    case 'A':
        valor = litros_vendidos * 1.90;
        
        if (litros_vendidos <= 20)
        {
            valor -= (valor * 3) / 100;
        }
        else
        {
            valor -= (valor * 5) / 100;
        }

        break;
    case 'G':
        valor = litros_vendidos * 2.50;

        if (litros_vendidos <= 20)
        {
            valor -= (valor * 4) / 100;
        }
        else
        {
            valor -= (valor * 6) / 100;
        }

        break;
}

Console.WriteLine("Valor a ser pago: R$ " + valor);