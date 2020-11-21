package pl.com.kurs;

import java.util.Scanner;

public class Lekcja1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String name;
        System.out.print("Podaj swoje imię: ");
        name = scanner.nextLine();
        System.out.printf("Hello %s", name);


    }

//    public void napiszDupa() {
//        System.out.println("DUPA!");
//    }
}
