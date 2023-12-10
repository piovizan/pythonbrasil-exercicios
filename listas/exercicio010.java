package listas;

/**
 * exercicio010
 */
public class exercicio010 {

    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,11,13,15,17,19};
        int[] b = {2,4,6,8,10,12,14,16,18,20};
        int[] c = new int[20];

        int cPos = 0;

        for (int i = 0; i < 10; i++) {
            c[cPos] = a[i];
            cPos++;
            c[cPos] = b[i];
            cPos++;
        }

        for (int numeros : c)
            System.out.print(numeros + " ");
    }
}