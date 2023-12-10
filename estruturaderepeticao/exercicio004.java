package estruturaderepeticao;

/**
 * exercicio004
 */
public class exercicio004 {

    public static void main(String[] args) {
        int paisA = 80000;
        int paisB = 200000;
        int anos = 0;

        while (paisA < paisB) {
            paisA += (3 * paisA) / 100;
            paisB += (int) ((1.5 * paisB) / 100);
            anos++;
        }

        System.out.printf("Serão necessários %d anos para o país A ultrapassar ou se igualhar a população do país B", anos);
    }
}