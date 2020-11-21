package pl.com.kurs;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Lekcja22 {
    public static void main(String[] args) {
//        usuwanie koleki id pierwszego do ostatniego
        Queue<String> kolejka = new ArrayDeque<>();


        kolejka.add("Pierwszy");
        kolejka.add("Drugi");
        kolejka.add("Trzeci");

        System.out.println(kolejka.size());//
//      podglada ale nie usuwa z kolejki
        System.out.println(kolejka.peek());
//      usuwa pierwszy z kolejki
        System.out.println(kolejka.remove());
//        usuwa pierwszy z kolejki, zwraca rónież wyjątek, jełśi nic nie ma pokaże null
        System.out.println(kolejka.poll());
        System.out.println(kolejka.remove());
        System.out.println(kolejka.size());
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
