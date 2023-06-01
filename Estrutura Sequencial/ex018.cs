// 18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

double tamanho, mbps, tempo;

Console.WriteLine("Informe o tamanho de um arquivo para download (MB): ");
tamanho = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("Informe a velocidade de sua Internet: ");
mbps = Convert.ToDouble(Console.ReadLine());
		
tempo = (tamanho / (mbps / 8)) / 60;
		
Console.WriteLine("Tempo de download: aprox. " + tempo + " minutos.");