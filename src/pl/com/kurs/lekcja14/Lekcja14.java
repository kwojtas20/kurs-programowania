package pl.com.kurs.lekcja14;

public class Lekcja14 {
    public static void main(String[] args){
        Zwierze kot = new Zwierze();
        kot.glos = "Meeow";
        kot.imie = "Milka";
        kot.przedstawSie();
        kot.dajGlos(3);

        Zwierze pies = new Zwierze();
        pies.imie = "Reksio";
        pies.przedstawSie();

    }
}

