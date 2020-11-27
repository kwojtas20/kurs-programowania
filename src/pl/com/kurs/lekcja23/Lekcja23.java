package pl.com.kurs.lekcja23;

public class Lekcja23 {

    public static void main(String[] args) {
        Samochod audi = new Samochod();
        audi.iloscKol = 4;
        audi.marka = "Audi";
        System.out.println(audi.iloscKol + " " + audi.marka);
        audi.odpal();

        audi.zamknijOtworz();

        SamochodSportowy subaru = new SamochodSportowy();
        subaru.zamknijOtworz();

        Motocykl suzuki = new Motocykl();
        System.out.println(suzuki.iloscKol);
    }
}
