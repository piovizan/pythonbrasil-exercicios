package classes.exercicio010;

public class BombaCombustivel {
    String tipoCombustivel;
    double valorLitro;
    double quantidadeCombustivel;

    BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    Double abastecerPorValor(Double valor) {
        double quantidadeLitros = valor / valorLitro;

        quantidadeCombustivel -= quantidadeLitros;

        return quantidadeLitros;
    }
    Double abastecerPorLitro(double quantidade) {
        quantidadeCombustivel -= quantidade;
        return quantidade * valorLitro;
    }
    void alterarValor(double valorLitro) {
        this.valorLitro = valorLitro;
    }
    void alterarCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    void alterarQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
}
