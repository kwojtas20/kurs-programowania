package pl.com.kurs.lekcja2;

/**
 * Typy danych.
 */
public class Lekcja2 {
    public static void main(String[] args) {
        // Znak
        char zmChar = 'B';
        System.out.println(zmChar);
        // String
        String zmString = "Kinga";
        System.out.println(zmString);
        // Boolean
        boolean zmBoolean = true;
        System.out.println(zmBoolean);
        //byte
        byte zmByte = Byte.MIN_VALUE;
        byte zmByte2 = Byte.MAX_VALUE;
        System.out.println("Byte: " + zmByte + " - " + zmByte2);
        //shot
        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        System.out.println("Short: " + zmShort + " - " + zmShort2);
        //int
        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        System.out.println("Int: " + zmInt + " - " + zmInt2);
        //long
        long zmLong = Long.MIN_VALUE;
        long zmLong2 = Long.MAX_VALUE;
        System.out.println("Long: " + zmLong + " - " + zmLong2);
        // float
        float zmFloat = Float.MIN_VALUE;
        float zmFloat2 = Float.MAX_VALUE;
        System.out.println("Float: " + zmFloat + " - " + zmFloat2);
        //double
        double zmDouble = Double.MIN_VALUE;
        double zmDouble2 = Double.MAX_VALUE;
        System.out.println("Double: " + zmDouble + " - " + zmDouble2);

        int liczba = 356;
        liczba = zmByte;
    }
}
