package classes.exercicio08;

import java.util.ArrayList;

public class Macaco {

    String nome;
    ArrayList<String> bucho = new ArrayList<>();

    public Macaco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    void comer(String comida) {
        bucho.add(comida);
    }
    void comer(ArrayList<String> comida) {
        bucho.addAll(comida);
    }
    void digerir() {
        bucho.clear();
    }
    ArrayList<String> verBucho() {
        return bucho;
    }
}