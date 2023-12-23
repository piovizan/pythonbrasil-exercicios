package classes.exercicio07;

public class Tamagotchi {
    String nome;
    String emoji;
    int fome = 0;
    int saude = 100;

    public String getNome() {
        return nome;
    }
    public String getEmoji() {
        return emoji;
    }
    public int getFome() {
        return fome;
    }
    public int getSaude() {
        return saude;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }
    public void setFome(int fome) {
        this.fome += fome;
    }
    public void setSaude(int saude) {
        this.saude += saude;
    }
}
