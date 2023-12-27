package classes.exercicio012;

public class ContaInvestimento {
    int numeroConta;
    String nome;
    double saldo;
    double taxaJuros;

    ContaInvestimento(double saldo, double taxaJuros) {
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public double getSaldo() {
        return saldo - ((taxaJuros * saldo) / 100);
    }

    void adicioneJuros() {
        taxaJuros += 10;
    }
}
