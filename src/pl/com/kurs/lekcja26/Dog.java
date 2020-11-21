package pl.com.kurs.lekcja26;


public class Dog extends Animal {
    Dog(String imie) throws ZleImieExeption {
        if (imie.length() ==0){
            throw new ZleImieExeption();
        }
        this.imie = imie;
    }

    String imie;

    @Override
    public void dajGlos() {
        System.out.println("How How");
    }

    public void idz() {
        System.out.println("Idę sobie");
    }
}