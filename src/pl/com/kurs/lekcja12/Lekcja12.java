package pl.com.kurs.lekcja12;

public class Lekcja12 {

    public static void main(String[] args) {
        int[] y = {5};
        zmien(y);
        System.out.println(y[0]);
    }

    public static void zmien(int[] x) {
        x = new int[1];
        x[0] += 20;
        System.out.println("Medoda: " + x[0]);
    }
}
