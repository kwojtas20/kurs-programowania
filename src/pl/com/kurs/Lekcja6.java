package pl.com.kurs;

public class Lekcja6 {
    public static void main(String[] args) {
        int poraRoku = 4;
//        Lekcja1 lekcja = new Lekcja1();
//        lekcja.napiszDupa();

        switch (poraRoku) {
            case 1:
                System.out.println("Wiosna");
                break;
            case 2:
                System.out.println("Lato");
                break;
            case 3:
                System.out.println("Jesień");
                break;
            case 4:
                System.out.println("Zima");
                break;
            default:
                System.out.println("Żyjesz na innej planecie :D");
        }
    }
}
