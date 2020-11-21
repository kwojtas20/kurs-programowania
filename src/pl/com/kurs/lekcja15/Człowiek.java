package pl.com.kurs.lekcja15;

public class Człowiek {
    Człowiek() {
        liczebnosc++;
    }

    Człowiek(String imie) {
        this.imie = imie;
        liczebnosc++;
    }

    Człowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        liczebnosc++;
    }

    public String imie;
    public String nazwisko;
    static int liczebnosc = 0;

}
