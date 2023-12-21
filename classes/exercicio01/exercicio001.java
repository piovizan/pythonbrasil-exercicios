package classes.exercicio01;

/**
 * exercicio001
 */
public class exercicio001 {

    public static void main(String[] args) {
        Bola bola = new Bola();

        bola.cor = "Preta";
        bola.circunferencia = 70.5;
        bola.material = "Couro";

        bola.trocaCor("Branca");
        System.out.println(bola.mostraCor());
    }
}