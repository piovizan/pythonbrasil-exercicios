/*
 * 43. O cardápio de uma lanchonete é o seguinte:
 * 
 *      Especificação   Código  Preço
 *      Cachorro Quente 100     R$ 1,20
 *      Bauru Simples   101     R$ 1,30
 *      Bauru com ovo   102     R$ 1,50
 *      Hambúrguer      103     R$ 1,20
 *      Cheeseburguer   104     R$ 1,30
 *      Refrigerante    105     R$ 1,00
 *      
 *      Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.
 */

int codigo, quantidade;
double valor = 0;

bool encerrar = false;

Console.WriteLine("CARDÁPIO");
Console.WriteLine("Especificação   Código  Preço\r\n" +
                  "Cachorro Quente 100     R$ 1,20\r\n" +
                  "Bauru Simples   101     R$ 1,30\r\n" +
                  "Bauru com ovo   102     R$ 1,50\r\n" +
                  "Hambúrguer      103     R$ 1,20\r\n" +
                  "Cheeseburguer   104     R$ 1,30\r\n" +
                  "Refrigerante    105     R$ 1,00");

while (!encerrar)
{
    Console.Write("\nCódigo do item: ");
    codigo = Convert.ToInt32(Console.ReadLine());

    Console.Write("Quantidade desejada: ");
    quantidade = Convert.ToInt32(Console.ReadLine());

    switch (codigo)
    {
        case 100:
            Console.WriteLine($"ITEM: CACHORRO QUENTE - {quantidade} unidades - R$ {1.20 * quantidade}");
            valor += 1.20 * quantidade;
            break;
        case 101:
            Console.WriteLine($"ITEM: BAURU SIMPLES - {quantidade} unidades - R$ {1.30 * quantidade}");
            valor += 1.30 * quantidade;
            break;
        case 102:
            Console.WriteLine($"ITEM: BAURU COM OVO - {quantidade} unidades - R$ {1.50 * quantidade}");
            valor += 1.50 * quantidade;
            break;
        case 103:
            Console.WriteLine($"ITEM: HAMBÚRGUER - {quantidade} unidades - R$ {1.20 * quantidade}");
            valor += 1.20 * quantidade;
            break;
        case 104:
            Console.WriteLine($"ITEM: CHEESEBURGUER - {quantidade} unidades - R$ {1.30 * quantidade}");
            valor += 1.30 * quantidade;
            break;
        case 105:
            Console.WriteLine($"ITEM: REFRIGERANTE - {quantidade} unidades - R$ {1 * quantidade}");
            valor += 1 * quantidade;
            break;
        default:
            Console.WriteLine("Código inexistente!");
            break;
    }

    Console.Write("Encerrar pedido? [s/n] ");
    if (Console.ReadLine() == "s") encerrar = true;
}

Console.WriteLine("\nValor total do pedido: R$ " + valor);