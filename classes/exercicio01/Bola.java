package classes.exercicio01;

public class Bola {
    String cor;
    int circunferencia;
    String material;

    Bola(String cor, int circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    void trocaCor(String novaCor) {
        this.cor = novaCor;
    }

    String mostraCor() {
        return cor;
    }

    public String toString() {
        return cor + "\n" + circunferencia + "\n" + material;
    }
}
