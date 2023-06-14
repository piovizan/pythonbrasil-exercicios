/*

28. O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:

                              Até 5 Kg           Acima de 5 Kg
        File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
        Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
        Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

    Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.

*/

Console.WriteLine("------------------ HIPERMERCADO TABAJARA -----------------\n" +
                  "|                       Até 5 Kg           Acima de 5 Kg |\n" +
                  "| File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg |\n" +
                  "| Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg |\n" +
                  "| Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg |\n" +
                  "----------------------------------------------------------");

string carne, pagamento;
double quantidade, valor = 0, desconto = 0;

Console.Write("Tipo da carne: ");
carne = Console.ReadLine().ToUpper();

Console.Write("Quantidade de carne: ");
quantidade = Convert.ToDouble(Console.ReadLine());

if (carne == "FILE DUPLO")
{
    if (quantidade > 5)
    {
        valor = quantidade * 5.80;
    }
    else
    {
        valor = quantidade * 4.90;
    }
}
else if (carne == "ALCATRA")
{
    if (quantidade > 5)
    {
        valor = quantidade * 6.80;
    }
    else
    {
        valor = quantidade * 5.90;
    }
}
else if (carne == "PICANHA")
{
    if (quantidade > 5)
    {
        valor = quantidade * 7.80;
    }
    else
    {
        valor = quantidade * 6.90;
    }
}
else
{
    Console.WriteLine("Produto indisponível.");
}

Console.WriteLine("Tipo de pagamento      \n" +
                  "- (1) Dinheiro         \n" +
                  "- (2) Cartão de crédito\n" +
                  "- (3) Cartão de débito \n" +
                  "- (4) Cartão Tabajara");

Console.Write("> ");
pagamento = Console.ReadLine();

switch (pagamento)
{
    case "1":
        pagamento = "Dinheiro";
        break;
    case "2":
        pagamento = "Cartão de crédito";
        break;
    case "3":
        pagamento = "Cartão de débito";
        break;
    case "4":
        pagamento = "Cartão Tabajara";
        desconto = (valor * 5) / 100;
        break;
    default:
        Console.WriteLine("Tipo de pagamento indisponível.");
        break;
}

Console.Clear();

Console.WriteLine("                   HIPERMERCADO TABAJARA - Cupom Fiscal\n" +
                  " Tipo ................................................. " + carne + "\n" +
                  " Quantidade ........................................... " + quantidade + " Kg \n" +
                  $" Preço total .......................................... R$ {valor:0.##}" + "\n" +
                  " Tipo de pagamento .................................... " + pagamento + "\n" +
                  " Valor do desconto .................................... R$ " + desconto + "\n" +
                  $" Valor a pagar ........................................ R$ {(valor - desconto):0.##}");