/*
    46. Em uma competição de salto em distância cada atleta tem direito a cinco saltos. No final da série de saltos de cada atleta, o melhor e o pior resultados são eliminados. O seu resultado fica sendo a média dos três valores restantes. Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe a média dos saltos conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a média). Faça uso de uma lista para armazenar os saltos. Os saltos são informados na ordem da execução, portanto não são ordenados. O programa deve ser encerrado quando não for informado o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:

        Atleta: Rodrigo Curvêllo

        Primeiro Salto: 6.5 m
        Segundo Salto: 6.1 m
        Terceiro Salto: 6.2 m
        Quarto Salto: 5.4 m
        Quinto Salto: 5.3 m

        Melhor salto:  6.5 m
        Pior salto: 5.3 m
        Média dos demais saltos: 5.9 m

        Resultado final:
        Rodrigo Curvêllo: 5.9 m
*/

public class Atleta
{
    public string Nome { get; set; }
    public double Media { get; set; }

    public Atleta(string nome, double media)
    {
        this.Nome = nome;
        this.Media = media;
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        List<Atleta> atletas = new List<Atleta>();

        string? atleta;

        do
        {
            double media = 0;
            double[] saltos = new double[5];

            Console.Write("\nAtleta: ");
            atleta = Console.ReadLine();

            if (atleta == "") break;

            for (int i = 0; i < 5; i++)
            {
                Console.Write($"{i + 1}º salto: ");
                saltos[i] = Convert.ToDouble(Console.ReadLine());
                
                media += saltos[i];
            }

            Array.Sort(saltos); // ordenando o vetor (do menor ao maior)

            Console.WriteLine($"\nMelhor salto: {saltos[saltos.Length - 1]}");
            Console.WriteLine($"Pior salto: {saltos[0]}");

            media -= saltos[0]; // removendo o pior salto
            media -= saltos[saltos.Length - 1]; // removendo o melhor salto
            media /= 3; // calculando a média dos demais saltos

            Console.WriteLine($"Média dos demais saltos: {media:0.##} m");

            atletas.Add(new Atleta(atleta, media));
        } while (atleta != "");

        Console.WriteLine("\nResultado final");

        foreach (Atleta pessoa in atletas)
        {
            Console.WriteLine($"{pessoa.Nome}: {pessoa.Media:0.##} m");
        }
    }
}