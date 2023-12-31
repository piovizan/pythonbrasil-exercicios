package manipulandostrings;

/**
 * exercicio001
 */
public class exercicio001 {

    public static void main(String[] args) {
        String string1 = "Brasil Hexa 2006";
        String string2 = "Brasil! Hexa 2006!";

        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        System.out.printf("Tamanho de \"%s\": %d caracteres\n", string1, string1.length());
        System.out.printf("Tamanho de \"%s\": %d caracteres\n", string2, string2.length());

        if (string1.length() == string2.length())
            System.out.println("As duas strings são de tamanhos iguais.");
        else
            System.out.println("As duas strings são de tamanhos diferentes.");
        
        if (string1.equals(string2))
             System.out.println("As duas string possuem conteúdos iguais.");
        else
            System.out.println("As duas string possuem conteúdos diferentes.");
    }
}