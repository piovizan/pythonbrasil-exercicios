package classes.exercicio017;
import java.util.Random;

public class Tamagotchi {
    Random random = new Random();

    String nome;
    // o bichinho 'nasce' com uma fome aleatória
    int fome = random.nextInt(100) + 1;
    int saude = 100;

    Tamagotchi(String nome) {
        this.nome = nome;
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

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFome(int fome) {
        this.fome = fome;
    }
    public void setSaude(int saude) {
        this.saude = saude;
    }

    void alimentar() {
        fome = fome - 2;
    }

    void brincar() {
        fome = fome + 5;
    }

    void mostrarEstatisticas() {
        System.out.println(nome.toUpperCase());
        System.out.println("Fome: " + fome);
        System.out.println("Saúde: " + saude);
    }
}