package classes.exercicio06;

public class Tv {
    int numero = 12;
    int volume = 0;

    void aumentarVolume() {
        if (volume >= 0 && volume < 100)
            volume += 1;
    }
    void diminuirVolume() {
        if (volume > 0 && volume <= 100)
            volume -= 1;
    }
}