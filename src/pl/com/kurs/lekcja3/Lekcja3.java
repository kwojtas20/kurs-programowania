package pl.com.kurs.lekcja3;

public class Lekcja3 {

    public static void main(String[] args) {

        int a = 20;
        int b = 20;

        /**
         * ++a oznacza, że wartość a zostaje zwiększona PRZED jej użyciem przez metodę System.out.println
         *
         * 1. Zwiększamy a o 1 czyli a=20+1
         * 2. Wyświetlamy a = 21
         * 3. TODO
         */
        System.out.println("a = " + ++a);
        System.out.println("a = " + a++);
        System.out.println("a = " + a);


        /**
         * b++ oznacza, że wartość a zostaje zwiększona PO użyciu jej przez metodę System.out.println
         *
         * 1. Wyświetlamy b = 20
         * 2. Zwiększamy b o 1 czyli b=20+1
         * 3. TODO
         */
        System.out.println("b = " + b++);
        System.out.println("b = " + b++);
        System.out.println("b = " + b);
        System.out.println("b = " + b);
    }
}
