package pl.com.kurs.lekcja14;

public class Zwierze {
    String imie;
    String glos = "Grrr";
    public void dajGlos(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print(glos);
            System.out.print(" ");

        }
        System.out.println();
    }
    public void przedstawSie(){
        System.out.println("Nazywam się "+ imie);
    }
}
