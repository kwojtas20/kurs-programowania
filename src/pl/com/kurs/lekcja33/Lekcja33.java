package pl.com.kurs.lekcja33;

import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

public class Lekcja33 {

    public static void main(String[] args) {

        File f = new File("plik.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
                System.out.println("Plik został utworzony");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (f.canWrite()) {
            try {
                FileWriter fw = new FileWriter(f, true);
                Formatter fm = new Formatter(fw);
                Scanner sf = new Scanner(f);

                Scanner sc = new Scanner(System.in);
                System.out.println("Podaj tekt do pliku: ");
                String tekst = sc.nextLine();
                fm.format("%s \r\n", tekst);
                System.out.println("Zapisano!");

                fm.close();
                fw.close();

                System.out.println("\nZAWARTOŚĆ PLIKU:");
                while (sf.hasNextLine()) {
                    System.out.println(sf.nextLine());
                }
                sc.close();
                sf.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
