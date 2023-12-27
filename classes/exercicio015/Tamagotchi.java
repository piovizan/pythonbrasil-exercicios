package classes.exercicio015;

public class Tamagotchi {
    String nome;
    int idade;
    int fome = 0;
    int saude = 100;

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
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
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setFome(int fome) {
        this.fome = fome;
    }
    public void setSaude(int saude) {
        this.saude = saude;
    }

    void checaFome() {
        if (fome < 0) fome = 0;
        if (fome > 100) fome = 100;
        if (fome == 100) perdeSaude();
        if (fome == 0) saude = 100;
    }

    void alimentar(int quantidade) {
        fome = fome - (2 * quantidade);
    }

    void brincar(int tempo) {
        fome = fome + (5 * tempo);
    }

    void perdeSaude() {
        saude = saude - 10;
    }
}
