package classes.exercicio08;

import java.util.ArrayList;

public class Macaco {

    private String nome;
    private ArrayList<String> bucho = new ArrayList<>();

    public Macaco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void comer(String comida) {
        bucho.add(comida);
    }
    public void comer(Macaco macaco) {
        bucho.add(macaco.getNome());
    }
    public void digerir() {
        bucho.clear();
    }
    public ArrayList<String> verBucho() {
        return bucho;
    }
}