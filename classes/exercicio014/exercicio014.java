package classes.exercicio014;

public class exercicio014 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Harry", 25000);
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());

        funcionario.aumentarSalario(10);

        System.out.println(funcionario.getSalario());
    }
}
