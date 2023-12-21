package classes.exercicio02;

public class Quadrado {
    double tamanhoLado;

    void mudaLado(double novoTamanho) {
        tamanhoLado = novoTamanho;
    }

    Double valorLado() {
        return tamanhoLado;
    }

    Double calculaArea() {
        return tamanhoLado * tamanhoLado;
    }
}