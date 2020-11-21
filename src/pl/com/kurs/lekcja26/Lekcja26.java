package pl.com.kurs.lekcja26;


import jdk.jshell.Diag;

public class Lekcja26 {
    public static void main(String[] args) {
        Animal kot = new Cat();
        kot.dajGlos();
//        Animal pies = new Dog("");
//        pies.dajGlos();
//
//        System.out.println(pies instanceof Cat);
//        if (pies instanceof Cat) {
//            ((Cat) pies).idz();
//        }
//        if (pies instanceof Dog) {
//            ((Dog) pies).idz();
//        }
        // tylko spróbuj - try
        try {
            Animal pies = new Dog("");
            pies.dajGlos();
            ((Dog) pies).idz();
            int a = 5 / 0;
//            wykona się, w try pojawił sie wyjątek
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
//            wykonuje się zawsze
        } catch (ArithmeticException e) {
            System.out.println("Błąd arytmetyczny");
        } catch (Exception e) {
            System.out.println("Inny bład");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("wykonuje się i tak");
        }
    }
}
