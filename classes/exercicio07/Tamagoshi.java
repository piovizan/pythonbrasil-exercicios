package classes.exercicio07;

public class Tamagoshi {
    String nome;
    int fome = 0;
    int saude = 100;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFome(int fome) {
        this.fome += fome;
    }
    public void setSaude(int saude) {
        this.saude += saude;
    }

    public String getNome() {
        return nome;
    }
    public int getFome() {
        return fome;
    }
    public int getSaude() {
        return saude;
    }
}