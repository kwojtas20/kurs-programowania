package pl.com.kurs.lekcja30;

public class Lekcja30 {
    public static void main(String[] args) {

//        sposób 1
//        Obliczenia ob1 = new Obliczenia();
//        Obliczenia ob2 = new Obliczenia();

//        ob1.start();
//        ob2.start();

        Thread ob1 = new Thread(new Obliczenia());
        Thread ob2 = new Thread(new Obliczenia());

        ob1.start();
        ob2.start();


    }
}
