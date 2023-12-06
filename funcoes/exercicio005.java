package funcoes;

/**
 * exercicio005
 */
public class exercicio005 {

    public static void main(String[] args) {
        double taxaImposto = 5;
        double custo = 260;

        System.out.println(somaImposto(taxaImposto, custo));
    }
    static double somaImposto(double taxaImposto, double custo) {
        return custo + ((taxaImposto * custo) / 100);
    }   

}