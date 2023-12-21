package classes.exercicio05;

/**
 * exercicio005
 */
public class exercicio005 {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123, "João Vitor", 0);

        System.out.println(conta.numeroConta);
        System.out.println(conta.nome);
        System.out.println(conta.saldo);

        conta.alteraNome("João Piovizan");
        System.out.println(conta.nome);

        conta.deposito(1500);
        System.out.println(conta.saldo);

        conta.saque(350);
        System.out.println(conta.saldo);
    }
}