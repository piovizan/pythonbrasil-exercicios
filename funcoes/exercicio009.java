package funcoes;

/**
 * exercicio009
 */
public class exercicio009 {

    public static void main(String[] args) {
        reverso(127);
    }
    static void reverso(int numero) {
        String reverso = Integer.toString(numero);

        for (int i = reverso.length() - 1; i >= 0; i--) {
            System.out.print(reverso.charAt(i));
        }
    }
}