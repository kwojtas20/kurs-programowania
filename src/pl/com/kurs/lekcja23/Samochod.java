package pl.com.kurs.lekcja23;

//Możemy dziedziczyć tylko po jednej klasie, interfejsy możemy być wiele
public class Samochod extends Pojazd {
    boolean otwarty = false;

    void zamknijOtworz() {
        otwarty = !otwarty;
        if (otwarty)
            System.out.println("Otwarto");
        else
            System.out.println("Zamknięto");

    }

}
