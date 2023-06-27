/*
 * 31. O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências. Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
 * 
 *      Lojas Tabajara
 *      Produto 1: R$ 2.20
 *      Produto 2: R$ 5.80
 *      Produto 3: R$ 0
 *      Total: R$ 9.00
 *      Dinheiro: R$ 20.00
 *      Troco: R$ 11.00
 *      ...
 */

bool encerrar = false;

while (!encerrar)
{
    int num_produto = 1;
    double valor, total = 0;
    double dinheiro, troco;

    Console.WriteLine("Lojas Tabajara");

    do
    {
        Console.Write("Produto " + num_produto + ": R$ ");
        valor = Convert.ToDouble(Console.ReadLine());

        total += valor;
        num_produto++;
    } while (valor != 0);

    Console.WriteLine("Total: R$ " + total);

    Console.Write("Dinheiro: R$ ");
    dinheiro = Convert.ToDouble(Console.ReadLine());

    troco = dinheiro - total;

    Console.WriteLine("Troco: R$ " + troco);
}