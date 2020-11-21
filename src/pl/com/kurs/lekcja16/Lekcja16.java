package pl.com.kurs.lekcja16;

public class Lekcja16 {
    public static void main(String[] args) {
//        referencje - jeśli powołujemy się na klasę, jak w tablicach identycznie (oliczba.liczba)
//        - kopiowanie przez referencje

        int liczba = 50;
        int liczba2 = liczba;
        liczba2 = 111;

        System.out.println("Liczba przed: " + liczba);
        zmien(liczba);
        System.out.println("Liczba po: " + liczba);


        Liczba oliczba = new Liczba();
        oliczba.liczba = 50;
        Liczba oliczba2 = oliczba;
        oliczba2.liczba =111;
        System.out.println("Obiekt Liczba przed: " + oliczba.liczba);
        zmien(oliczba);
        System.out.println("Obiekt Liczba po: " + oliczba.liczba);

    }

    public static void zmien(int liczba) {
        liczba = -1;

    }

    public static void zmien(Liczba oliczba) {
        oliczba.liczba = -1;

    }
}
