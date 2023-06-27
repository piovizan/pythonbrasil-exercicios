/* 37. Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que pergunte a cada um dos clientes da academia seu código, sua altura e seu peso.
 * 
 * O final da digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código. Ao encerrar o programa também deve ser informados os códigos e valores do cliente mais alto, do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos clientes.
*/

int codigo;
double altura, peso;

int clientes = 0;

int codigo_mais_alto = 0;
int codigo_mais_baixo = 0;
int codigo_mais_gordo = 0;
int codigo_mais_magro = 0;

double mais_alto = 0;
double mais_baixo = 3.00;

double mais_gordo = 0;
double mais_magro = 700;

double media_alturas = 0;
double media_pesos = 0;

do
{
    Console.Write("Código: ");
    codigo = Convert.ToInt32(Console.ReadLine());

    if (codigo != 0)
        clientes++;
    else
        break;

    Console.Write("Altura (metros): ");
    altura = Convert.ToDouble(Console.ReadLine());
    
    media_alturas += altura;

    Console.Write("Peso (kg): ");
    peso = Convert.ToDouble(Console.ReadLine());

    media_pesos += peso;

    if (altura > mais_alto)
    {
        codigo_mais_alto = codigo;
        mais_alto = altura;
    }

    if (altura < mais_baixo)
    {
        codigo_mais_baixo = codigo;
        mais_baixo = altura;
    }

    if (peso > mais_gordo)
    {
        codigo_mais_gordo = codigo;
        mais_gordo = peso;
    }

    if (peso < mais_magro)
    {
        codigo_mais_magro = codigo;
        mais_magro = peso;
    }
} while (codigo != 0);

Console.Clear();

Console.WriteLine("CLIENTE MAIS ALTO");
Console.WriteLine("Código: " + codigo_mais_alto);
Console.WriteLine("Altura: " + mais_alto);

Console.WriteLine("\nCLIENTE MAIS BAIXO");
Console.WriteLine("Código: " + codigo_mais_baixo);
Console.WriteLine("Altura: " + mais_baixo);

Console.WriteLine("\nCLIENTE MAIS GORDO");
Console.WriteLine("Código: " + codigo_mais_gordo);
Console.WriteLine("Peso: " + mais_gordo);

Console.WriteLine("\nCLIENTE MAIS MAGRO");
Console.WriteLine("Código: " + codigo_mais_magro);
Console.WriteLine("Peso: " + mais_magro);

Console.WriteLine("\nMédia das alturas: " + (media_alturas / clientes));
Console.WriteLine("Média dos pesos: " + (media_pesos / clientes));