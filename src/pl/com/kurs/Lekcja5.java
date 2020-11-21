package pl.com.kurs;

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

        String imie = wiek >=18 ? "Bartek" : "Bartuś";
        System.out.println(imie);
    }
}
