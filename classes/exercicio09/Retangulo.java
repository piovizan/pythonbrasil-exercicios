package classes.exercicio09;

public class Retangulo {
    double largura, altura;
    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    void centro() {
        Ponto ponto = new Ponto(largura, altura);

        System.out.println("x = " + ponto.x);
        System.out.println("y = " + ponto.y);
    }
}
