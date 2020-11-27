package pl.com.kurs.lekcja28;

public class Lekcja28 {

    public static void main(String[] args) {
        Samochod bmw = new Samochod("BMW", Kolory.CZARNY);

        switch (bmw.kolory) {
            case BIALY:
                break;
            case CZARNY:
                break;
            case NIEBIESKI:
                break;
        }
    }
}
