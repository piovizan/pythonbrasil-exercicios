package classes.exercicio08;

import java.util.ArrayList;

/**
 * exercicio008
 */
public class exercicio008 {

    public static void main(String[] args) {
        Macaco macaco01 = new Macaco("Tico");
        Macaco macaco02 = new Macaco("Teco");

        ArrayList<String> alimentos = new ArrayList<>();
        alimentos.add("Maçã");
        alimentos.add("Banana");
        alimentos.add("Uva");

        macaco01.comer(alimentos.get(0));
        macaco01.comer(alimentos.get(1));
        macaco01.comer(alimentos.get(2));

        System.out.println("Bucho do " + macaco01.getNome());
        System.out.println(macaco01.verBucho());

        macaco02.comer(macaco01.getNome());

        System.out.println("Bucho do " + macaco02.getNome());
        System.out.println(macaco02.verBucho());
    }
}