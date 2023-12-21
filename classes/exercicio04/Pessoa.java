package classes.exercicio04;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    float altura;

    void envelhecer() {
        idade += 1;
        if (idade < 21)
            altura += 0.005f;
    }
    void engordar(double kgs) {
        peso += kgs;
    }
    void emagrecer(double kgs) {
        peso -= kgs;
    }
    void crescer(float tamanho) {
        altura += tamanho;
    }
}