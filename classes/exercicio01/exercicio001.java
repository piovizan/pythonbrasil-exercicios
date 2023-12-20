package classes.exercicio01;

public class exercicio001 {
    public static void main(String[] args) {
        Bola bola = new Bola("Preta", 70, "Couro");

        System.out.println(bola);

        bola.trocaCor("Branca");
        System.out.println("Nova cor: " + bola.mostraCor());
    }
}
