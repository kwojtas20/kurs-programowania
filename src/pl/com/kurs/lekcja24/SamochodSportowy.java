package pl.com.kurs.lekcja24;

public class SamochodSportowy extends Samochod{
    SamochodSportowy(String marka, int iloscKol, int iloscDrzwi){
        super(marka, iloscKol, iloscDrzwi);
        System.out.println("Konstruktor klasy - Samochód sportowy");
    }
}
