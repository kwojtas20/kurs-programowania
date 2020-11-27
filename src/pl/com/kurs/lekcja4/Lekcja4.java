package pl.com.kurs.lekcja4;

public class Lekcja4 {
    public static void main(String[] args) {
        int a = 5, b = 6;
        //false
        boolean logiczna = a == b;
        System.out.println(logiczna);
        int c = 5, d = 6;
        //true
        boolean logiczna2 = c != d;
        System.out.println(logiczna2);
        int e = 5, f = 6;
        //false
        boolean logiczna3 = e > f;
        System.out.println(logiczna3);
        int g = 5, h = 6;
        //true
        boolean logiczna4 = g < h;
        System.out.println(logiczna4);
        int i = 5, j = 6;
        //true
        boolean logiczna5 = i <= j;
        System.out.println(logiczna5);
        int k = 6, l = 6;
        //true
        boolean logiczna6 = k >= l;
        System.out.println(logiczna6);
        int m = 6, n = 6;
        //false
        boolean logiczna7 = 5 >= 5 && 6 < 1 ;
        System.out.println(logiczna7);
        int o = 6, p = 6;
        //true
        boolean logiczna8 = 5 >= 5 && 0 < 1 && true ;
        System.out.println(logiczna8);
        int r = 6, s = 6;
        //true
        boolean logiczna9 = 5 >= 5 || 0 < 1 ;
        System.out.println(logiczna9);
        int u = 6, w = 6;
        //true
        boolean logiczna10 = 5 >= 5 || 0 < 1 && 5 > 6;
        System.out.println(logiczna10);
        int v = 6, z = 6;
        //false
        boolean logiczna11 = !true;
        System.out.println(logiczna11);
        int x = 6,  t = 6;
        //false
        boolean logiczna12 = !(x == t);
        System.out.println(logiczna12);


    }
}
