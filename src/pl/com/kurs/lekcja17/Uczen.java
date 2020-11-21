package pl.com.kurs.lekcja17;

public class Uczen {

    private String nazwisko;
    private int ocena;

    String getNazwisko() {
        return "Nazwisko: " + this.nazwisko;
    }

    void setNazwisko(String nazwisko) {
        if (nazwisko.length() >= 2) {
            this.nazwisko = nazwisko;
        }
    }

    int getOcena() {
        return this.ocena;
    }

    void setOcena(int ocena) {
        if (ocena >= 1 && ocena <= 6) {
            this.ocena = ocena;
        }
    }

}
