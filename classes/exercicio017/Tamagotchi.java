package classes.exercicio017;
import java.util.Random;

public class Tamagotchi {
    Random random = new Random();

    String nome;
    String humor;
    // o bichinho 'nasce' com uma fome aleatória
    int fome = random.nextInt(100) + 1;
    int saude = 100;

    Tamagotchi(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    public String getHumor() {
        return humor;
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
    public void setHumor(String humor) {
        this.humor = humor;
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

    void checaFome() {
        if (fome < 0)
            fome = 0;        
        
        if (fome > 100)
            fome = 100;
        
        if (fome == 100)
            saude = saude - 10;

        if (fome == 0)
            saude = 100;
    }

    void checaHumor() {
        if (fome < 10 && saude == 100)  
            humor = "Feliz";
        
        if (fome >= 10 && fome < 50)
            humor = "Pouca fome";
        
        if (fome >= 50)
            humor = "Faminto";

        if (saude < 100)
            humor = "Doente";
        
        if (saude == 0)
            humor = "Morto";
    }

    void mostrarEstatisticas() {
        System.out.println(nome.toUpperCase());

        checaFome();
        checaHumor();

        System.out.println("Humor: " + humor);        
        System.out.println("Fome: " + fome);
        System.out.println("Saúde: " + saude);
    }
}