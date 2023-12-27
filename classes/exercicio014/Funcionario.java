package classes.exercicio014;

public class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    void aumentarSalario(double porcentagem) {
        salario += ((porcentagem * salario) / 100);
    }
}
