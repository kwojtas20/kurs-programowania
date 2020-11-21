package pl.com.kurs;

public class Lekcja11 {
    public static void main(String[] args) {
//        String h = wyswietl();
//        System.out.println(h);
        System.out.println(dodaj());
        System.out.println(dodaj(5));
        System.out.println(dodaj(5,  6));
    }

    //    static String wyswietl(){
////        return "Hello World!";
////    }
    static int dodaj() {
        return 0;
    }

    static int dodaj(int x) {
        return ++x;
    }

    static int dodaj(int x, int y) {
        return x + y;
    }
}
