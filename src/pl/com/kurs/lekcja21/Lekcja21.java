package pl.com.kurs.lekcja21;

import java.util.ArrayList;
import java.util.Collections;

public class Lekcja21 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Poznań");
        lista.add("Warszawa");
        lista.add("Gdańsk");
        lista.add("Szczecin");

        System.out.println();
        for (String e : lista) {
            System.out.println(e);
        }

        Collections.sort(lista);
//        od najminiejszej do największej Spring - alfabetycznie, int -  cyfrowo

        System.out.println();
        for (String e : lista) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println(Collections.min(lista));

        System.out.println();
        System.out.println(Collections.max(lista));

        System.out.println();
        Collections.reverse(lista);
//        kolekcja od końca do początku
        for (String e : lista) {
            System.out.println(e);
        }

        Collections.shuffle(lista);
//        przekasuj, pomieszaj
        System.out.println();
        for (String e : lista) {
            System.out.println(e);
        }
        ArrayList<Animal> koty = new ArrayList<Animal>();
        Animal kot1 = new Animal("Czarny");
        Animal kot2 = new Animal("Bury");
        Animal kot3 = new Animal("Rudy");
        Animal kot4 = new Animal("Biały");
        Animal kot5 = new Animal("Biały");
        kot4.wiek = 10;

        koty.add(kot1);
        koty.add(kot2);
        koty.add(kot3);
        koty.add(kot4);
        koty.add(kot5);

        System.out.println();
        for (Animal kot : koty) {
            System.out.println(kot.name + " " + kot.wiek + " lat.");

        }
        System.out.println();
        Collections.sort(koty);
        for (Animal kot : koty) {
            System.out.println(kot.name + " " + kot.wiek + " lat.");
        }
    }
}
