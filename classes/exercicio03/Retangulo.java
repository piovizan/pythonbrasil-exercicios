package classes.exercicio03;

public class Retangulo {
    double ladoA;
    double ladoB;

    void mudarLados(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    String valorLados() {
        return ladoA + ", " + ladoB;
    }

    double calcularArea() {
        return ladoA * ladoB;
    }

    double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}