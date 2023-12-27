package classes.exercicio012;

/**
 * exercicio012
 */
public class exercicio012 {

    public static void main(String[] args) {
        ContaInvestimento conta = new ContaInvestimento(1000, 10);
        System.out.println(conta.getSaldo());

        for (int i = 0; i < 5; i++) {
            conta.adicioneJuros();
        }

        System.out.println(conta.getSaldo());
    }
}