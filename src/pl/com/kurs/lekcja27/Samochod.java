package pl.com.kurs.lekcja27;

//klasę zaintemeplotować możemy tylko jedną, zaś infersejsów wiele
public class Samochod extends Pojazd implements  Poruszanie, Comparable<String>{
    Samochod(String nazwa, int iloscKol)
    {super(nazwa);
    this.iloscKol = iloscKol;
    }
    int iloscKol;

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void jedzDoPrzodu() {
        System.out.println("Jadę");

    }

    @Override
    public void skrecaj() {
        System.out.println("Skręcam");
    }
}
