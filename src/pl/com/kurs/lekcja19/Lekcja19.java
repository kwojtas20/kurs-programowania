package pl.com.kurs.lekcja19;

import pl.com.kurs.lekcja19.Animal_lekcja19;

import java.util.ArrayList;

public class Lekcja19 {
    public static void main(String[] args) {
        Animal_lekcja19 kot1 = new Animal_lekcja19("Rudy");
        Animal_lekcja19 kot2 = new Animal_lekcja19("Bury");
        Animal_lekcja19 kot3 = new Animal_lekcja19("Biały");

        ArrayList lista = new ArrayList();
        ArrayList <Animal_lekcja19> listaG = new ArrayList<Animal_lekcja19>();

        lista.add(kot1);
        lista.add(kot2);
        lista.add(kot3);

        listaG.add(kot1);
        listaG.add(kot2);
        listaG.add(kot3);

        System.out.println("________");
        for(Animal_lekcja19 k : listaG){
            System.out.println(k.imie);
        }
        System.out.println("________");
        System.out.println((listaG.get(0)).imie);
        System.out.println(((Animal_lekcja19)lista.get(0)).imie);



        System.out.println((listaG.get(0)).imie);
        System.out.println(listaG.size());
        System.out.println(listaG.contains(kot1));
        listaG.remove(kot2);
        listaG.remove(0);
        listaG.clear();
        System.out.println(listaG.size());


        System.out.println("________");
        for(Animal_lekcja19 k : listaG){
            System.out.println(k.imie);
        }
        System.out.println("________");


    }
}
