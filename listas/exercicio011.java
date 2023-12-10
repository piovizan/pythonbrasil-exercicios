package listas;

/**
 * exercicio011
 */
public class exercicio011 {

    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,11,13,15,17,19};
        int[] b = {2,4,6,8,10,12,14,16,18,20};
        int[] c = {101,102,103,104,105,106,107,108,109,100};
        int[] d = new int[30];

        int dPos = 0;

        for (int i = 0; i < 10; i++) {
            d[dPos] = a[i];
            dPos++;
            d[dPos] = b[i];
            dPos++;
            d[dPos] = c[i];
            dPos++;
        }

        for (int numeros : d)
            System.out.print(numeros + " ");
    }
}