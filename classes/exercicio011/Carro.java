package classes.exercicio011;

public class Carro {
    double consumo;
    double tanque = 0;

    Carro(double consumo) {
        this.consumo = consumo;
    }

    void andar(double km) {
        System.out.println("Andou " + km + " km");
        tanque -= km / consumo;
    }
    double obterGasolina() {
        return tanque;
    }
    void adicionarGasolina(double litros) {
        tanque += litros;
    }
}
