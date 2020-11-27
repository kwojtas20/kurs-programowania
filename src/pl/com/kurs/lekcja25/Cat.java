package pl.com.kurs.lekcja25;

public class Cat extends Animal {

    public void idz() {
        System.out.println("Idę sobie");
    }

    @Override
    public void dajGlos() {
        System.out.println("Meow Meow");
    }
}
