package pl.com.kurs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Lekcja20 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Poznań");
        lista.add("Warszawa");
        lista.remove(0);
//        for (String e : lista) {
//            System.out.println(e);
//
//        }
        lista.clear();

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Poniedziałek");
        mapa.put(5, "Piątek");
        mapa.put(7, "Niedziela");

        System.out.println(mapa.get(5));
        System.out.println();
        for (String e : mapa.values()){
            System.out.println(e);

        }
        LinkedHashSet<String> zbior = new LinkedHashSet<>();
//        przechowuje kolekcje uniaktowe
        zbior.add("Warszawa");
        zbior.add("Poznań");
        zbior.add("Szczecin");
        zbior.add("Szczecin");

        System.out.println();
        for(String e : zbior){
            System.out.println(e);
        }
        System.out.println(zbior.size());
    }
}
