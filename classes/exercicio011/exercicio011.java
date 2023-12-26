package classes.exercicio011;

/**
 * exercicio011
 */
public class exercicio011 {

    public static void main(String[] args) {
        Carro meuFusca = new Carro(15);
        meuFusca.adicionarGasolina(20);
        meuFusca.andar(100);
        System.out.println(meuFusca.obterGasolina());
    }
}