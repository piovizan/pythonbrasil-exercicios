/*

27. Uma fruteira está vendendo frutas com a seguinte tabela de preços:

                              Até 5 Kg           Acima de 5 Kg
        Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
        Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg

    Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

*/

double valor = 0;
double morangos, macas;

Console.WriteLine(
    "                      Até 5 Kg           Acima de 5 Kg\n" +
    "Morango         R$ 2,50 por Kg          R$ 2,20 por Kg\n" +
    "Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg");

Console.WriteLine("Quantidade (em Kg) de morangos: ");
morangos = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Quantidade (em Kg) de maçãs: ");
macas = Convert.ToDouble(Console.ReadLine());

if (morangos > 5)
{
    valor += morangos * 2.20;
}
else
{
    valor += morangos * 2.50;
}

if (macas > 5)
{
    valor += macas * 1.50;
}
else
{
    valor += macas * 1.80;
}

if (valor > 25 || (morangos + macas) > 8)
{
    valor -= (valor * 10) / 100;
}

Console.WriteLine("Valor a ser pago: R$ " + valor);