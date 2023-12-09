package funcoes;

import java.util.ArrayList;
import java.util.Random;

/**
 * exercicio012
 */
public class exercicio012 {

    public static void main(String[] args) {
        String palavra = "Python";
        System.out.println(embaralha(palavra));
    }
    static String embaralha(String palavra) {
        Random random = new Random();
        ArrayList<Integer> sorteados = new ArrayList<>();
        StringBuilder palavraEmbaralhada = new StringBuilder();

        int numero;

        while (palavraEmbaralhada.length() < palavra.length()) {
            numero = random.nextInt(palavra.length());

            if (sorteados.isEmpty() || !sorteados.contains(numero)) {
                sorteados.add(numero);
                palavraEmbaralhada.append(palavra.charAt(numero));
            }
        }

        return palavraEmbaralhada.toString().toLowerCase();
    }
}