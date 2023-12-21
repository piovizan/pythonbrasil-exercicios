package classes.exercicio04;

/**
 * exercicio004
 */
public class exercicio004 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "João";
        pessoa.idade = 15;
        pessoa.peso = 60.0;
        pessoa.altura = 1.75f;

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Peso: " + pessoa.peso);
        System.out.println("Altura: " + pessoa.altura);

        pessoa.envelhecer();
        pessoa.engordar(2.5);
        pessoa.crescer(0.03f);

        System.out.println("Nova idade: " + pessoa.idade);
        System.out.println("Novo peso: " + pessoa.peso);
        System.out.printf("Nova altura: %.2f\n", pessoa.altura);

        pessoa.envelhecer();
        System.out.println("Nova idade: " + pessoa.idade);
        System.out.printf("Nova altura: %.2f\n", pessoa.altura);

        pessoa.emagrecer(1.5);
        System.out.println("Novo peso: " + pessoa.peso);
    }
}