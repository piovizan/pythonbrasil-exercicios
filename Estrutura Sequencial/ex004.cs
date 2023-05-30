// 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        
double nota1, nota2, nota3, nota4;
double media;
        
Console.WriteLine("Primeira nota: ");
nota1 = Convert.ToInt32(Console.ReadLine());
        
Console.WriteLine("Segunda nota: ");
nota2 = Convert.ToInt32(Console.ReadLine());
        
Console.WriteLine("Terceira nota: ");
nota3 = Convert.ToInt32(Console.ReadLine());
        
Console.WriteLine("Quarta nota: ");
nota4 = Convert.ToInt32(Console.ReadLine());
        
media = (nota1 + nota2 + nota3 + nota4) / 4;
        
Console.WriteLine("A média é: " + media);
