package classes.exercicio05;

public class ContaCorrente {
    int numeroConta;
    String nome;
    double saldo;

    ContaCorrente(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = 0;
    }

    void alteraNome(String nome) {
        this.nome = nome;
    }

    void deposito(double valor) {
        saldo += valor;
    }

    void saque(double valor) {
        saldo -= valor;
    }
}
