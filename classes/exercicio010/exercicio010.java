package classes.exercicio010;

public class exercicio010 {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.63, 10000);

        System.out.println(bomba.abastecerPorValor(10.0));
        System.out.println(bomba.quantidadeCombustivel);

        System.out.println(bomba.abastecerPorLitro(50));
        System.out.println(bomba.quantidadeCombustivel);

        bomba.alterarCombustivel("Alcool");
        bomba.alterarValor(3.64);
        bomba.alterarQuantidadeCombustivel(20000);

        System.out.println(bomba.quantidadeCombustivel);

        System.out.println(bomba.abastecerPorValor(100.0));
        System.out.println(bomba.quantidadeCombustivel);
    }
}
