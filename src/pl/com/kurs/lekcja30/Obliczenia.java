package pl.com.kurs.lekcja30;

//1 sposób
//public class Obliczenia extends Thread{
//    @Override
//    public void run() {
//        for(int i = 0; i <= 100; i++){
//            System.out.println(i + ". ID:" + Thread.currentThread().getId());
//        }
//    }
//}


public class Obliczenia implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + ". ID:" + Thread.currentThread().getId());
        }

    }
}