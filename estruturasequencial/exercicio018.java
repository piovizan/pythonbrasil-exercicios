package estruturasequencial;
import java.util.Scanner;

/**
 * 18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
 */
public class exercicio018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamanho do arquivo: ");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.println("Velocidade da Internet (Mbps): ");
        double velocidade = scanner.nextDouble();

        double tempoDownload = tamanhoArquivo / (velocidade / 8);

        System.out.println("Tempo de download: " + tempoDownload);
    }
}