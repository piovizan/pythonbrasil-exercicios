package funcoes;

/**
 * exercicio008
 */
public class exercicio008 {

    public static void main(String[] args) {
        int numero = 14444;
        
        System.out.println(digitos(numero));
    }
    static int digitos(int numero) {
        String n = Integer.toString(numero);        
        return n.length();
    }
}