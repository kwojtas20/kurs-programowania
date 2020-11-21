package pl.com.kurs.lekcja29;
// klasa w klasie (wewnętrzna), można użyć metod z kalsy amial w Pen nawet gdy klasa Amimal jest private, na oddwrót to nie działa, ze mgę użyć metody z klasy Pet do Animal
public class Animal {
     void makeVoice(){
        System.out.println("Grrr");
    }
    void eat(){
        System.out.println("om om om");
    }
    class Pet{
        String name;
        void getName(){
//            makeVoice();
            System.out.println(name);
        }
    }
}
