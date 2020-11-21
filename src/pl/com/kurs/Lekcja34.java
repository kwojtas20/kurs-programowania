package pl.com.kurs;

public class Lekcja34 {
    //    rekrurencja - odwołanie się do samego siebie
    public static void main(String[] args) {
        final int LICZBA = 10;
        long start = System.nanoTime();
        System.out.println(silnia(LICZBA));
        long elapsed = System.nanoTime() - start;
        System.out.println("Czas: " + elapsed);

        System.out.println();

        start = System.nanoTime();
        System.out.println(silniaRek(LICZBA));
        elapsed = System.nanoTime() - start;
        System.out.println("Czas: " + elapsed);

    }

    private static long silniaRek(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * silniaRek(x - 1);
        }
    }

    private static long silnia(int x) {
        long wynik = 1;
        while (x > 1) {
            wynik = wynik *= x;
            x--;
        }
        return wynik;
    }
}
