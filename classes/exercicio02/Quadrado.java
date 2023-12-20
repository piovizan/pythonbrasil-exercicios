package classes.exercicio02;

public class Quadrado {
    double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    void mudarLado(double novoLado) {
        lado = novoLado;
    }

    double mostraLado() {
        return lado;
    }

    double calcularArea() {
        return lado * lado;
    }
}