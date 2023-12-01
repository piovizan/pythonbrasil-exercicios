package estruturasequencial;
/**
 * 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 * fórmula: area = base * altura
 */
public class exercicio007 {

    public static void main(String[] args) {
        // quadrado tem o mesmo valor na base/altura
        double base = 20;
        double altura = 20;

        double area = base * altura;

        System.out.println(area * 2); // mostrando o dobro da area
    }
}