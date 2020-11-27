package pl.com.kurs.lekcja10;

public class Lekcja10 {

    public static void main(String[] args) {

        String[] tab = {"Ania", "Bartek", "Adam", "Asia"};

        /**
         * Pętla foreach (dla każdego) wykonuje instrukcje dla każdego elementu tablicy "tab"
         * Nazwa obiektu "item" jest dowolnie ustalana.
         */
        for (String item : tab) {
            System.out.println(item);
        }
    }
}
