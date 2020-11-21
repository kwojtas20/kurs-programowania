package pl.com.kurs.lekcja25;

public class Lekcja25 {
    public static void main(String[] args){
        Cat kot = new Cat();
        kot.idz();
        kot.dajGlos();
        Animal pies = new Dog();
        pies.dajGlos();
        ((Dog)pies).idz();

//        Animal chomik = new Animal(); - błąd
    }

}
