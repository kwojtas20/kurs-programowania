package pl.com.kurs.lekcja7;

public class Lekcja7 {

    public static void main(String[] args) {

        int i = -5;
        int j = -5;

        /**
         * Ta pętla wykona się 0 lub więcej razy jeśli spełni warunek i > 0
         *
         * 1.
         * 2.
         * 3.
         */
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        /**
         * Ta pętla wykona się przynajmniej raz lub więcej razy jeśli spełni warunek
         * Pierw wykona się to co w bloku do {} a dopiero potem sprawdzany jest warunek czy pętla ma się wykonać ponownie
         */
        do {
            System.out.println(j);
            j--;
        } while (j > 0);

        /**
         * Pętla wykona się 0 lub więcej razy zgodnie z warunkiem k > 0
         *
         * 1. k = 5
         * 2. sprawdza czy k > 0
         * 3. Wykonuje pentlę
         * 4. pomniejsza k o 1
         * 5. ponownie sprawdza warunek czy k > 0
         * 6. itd dopóki warunek jest spełniony
         */
        for (int k = 5; k > 0; k--) {
            System.out.println(k);
        }
    }
}
