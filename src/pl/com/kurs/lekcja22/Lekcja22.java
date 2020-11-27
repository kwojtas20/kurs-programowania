package pl.com.kurs.lekcja22;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Lekcja22 {

    public static void main(String[] args) {
//        usuwanie kolekcji id pierwszego do ostatniego
        Queue<String> kolejka = new ArrayDeque<>();

        kolejka.add("Pierwszy");
        kolejka.add("Drugi");
        kolejka.add("Trzeci");

        System.out.println(kolejka.size());//
//      podglada ale nie usuwa z kolejki
        System.out.println(kolejka.peek());
//      usuwa pierwszy z kolejki
        System.out.println(kolejka.remove());
//        usuwa pierwszy z kolejki, zwraca rónież wyjątek, jeśli nic nie ma pokaże null
        System.out.println(kolejka.poll());
        // usuwa pierwszy z kolejki
        System.out.println(kolejka.remove());
        //sprawdza rozmiar
        System.out.println(kolejka.size());
        //        usuwa pierwszy z kolejki, zwraca rónież wyjątek, jeśli nic nie ma pokaże null
        System.out.println(kolejka.poll());

        System.out.println("\n\nStos:");
//        działą odwtornie do quese, aby usunąć co jest pierwsze najpierw trzeba usunąc ostanie i wsztstko po nim
        Stack<String> stos = new Stack<>();
        stos.push("Pierwszy");
        stos.push("Drugi");
        stos.push("Trzeci");

        System.out.println(stos.peek());
        System.out.println(stos.size());
        System.out.println(stos.pop());
        stos.push("Ostatni");
        System.out.println(stos.pop());
    }
}
