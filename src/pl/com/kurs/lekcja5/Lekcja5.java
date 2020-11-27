package pl.com.kurs.lekcja5;

public class Lekcja5 {
    public static void main(String[] args) {
        int wiek = 15;
        if (wiek >= 18) {
            System.out.println("Pełnoletnia");
        } else if (wiek >= 16) {
            System.out.println("Możesz pracować");
        } else {
            System.out.println("Nie możesz jeszcze nic!");
        }

        /**
         * warunek: jeśli wiek jest wiekszy równy(prawda - ?) 18 to "Bartek", jeśli nie (fałsz - :) to "Bartuś"
         * - ternary operator
         */
        String imie = wiek >=18 ? "Bartek" : "Bartuś";
        System.out.println(imie);
    }
}
