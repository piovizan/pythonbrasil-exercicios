package funcoes;

import java.util.ArrayList;
import java.util.Random;

/**
 * exercicio012
 */
public class exercicio012 {

    public static void main(String[] args) {
        String palavra = "Java";
        System.out.println(embaralha(palavra));
    }
    static String embaralha(String palavra) {
        Random random = new Random();

        ArrayList<Character> caracteres = new ArrayList<>();
        ArrayList<Integer> sorteados = new ArrayList<>();
        StringBuilder palavraEmbaralhada = new StringBuilder();

        int numero;

        for (int i = 0; i < palavra.length(); i++) {
            caracteres.add(palavra.charAt(i));
        }

        while (palavraEmbaralhada.length() < palavra.length()) {
            numero = random.nextInt(caracteres.size());

            if (sorteados.isEmpty() || !sorteados.contains(numero)) {
                sorteados.add(numero);
                palavraEmbaralhada.append(caracteres.get(numero));
            }
        }

        return palavraEmbaralhada.toString().toLowerCase();
    }
}