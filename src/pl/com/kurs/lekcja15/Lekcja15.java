package pl.com.kurs.lekcja15;

public class Lekcja15 {
    public static void main(String[] args) {
        Człowiek jan = new Człowiek("Jan");
//        Jan.imie = "Jan";
        System.out.println(jan.imie);
        System.out.println(Człowiek.liczebnosc);

        Człowiek daniel = new Człowiek();
        daniel.imie = "Daniel";
        System.out.println(Człowiek.liczebnosc);

        Człowiek mariusz = new Człowiek("Mariusz", "Mariuszowy");
        System.out.println(mariusz.imie);
        System.out.println(mariusz.nazwisko);
        System.out.println(Człowiek.liczebnosc);
    }
}
