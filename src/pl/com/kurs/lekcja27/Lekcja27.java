package pl.com.kurs.lekcja27;

public class Lekcja27 {

    public static void main(String[] args) {
        System.out.println(Poruszanie.nazwaInterfejsu);
        Samochod car = new Samochod("BMW", 4);
        car.jedzDoPrzodu();
        car.skrecaj();
    }
}
