package pl.com.kurs.lekcja24;

public class Lekcja24 {
    public static void main(String[] args) {
        System.out.println("Audi:");
        Samochod audi = new Samochod("Audi", 4, 2);
        audi.iloscKol = 4;
        audi.marka = "Audi";

        System.out.println("Subaru:");
        SamochodSportowy subaru = new SamochodSportowy("Subaru", 4, 4);
    }
}

