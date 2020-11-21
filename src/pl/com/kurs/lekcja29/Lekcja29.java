package pl.com.kurs.lekcja29;

public class Lekcja29 {
    public static void main(String[] args) {
//        klasa anominowa bo w ciele Animal zmieniamy to co ma się pojawić jest to tylko w tym jednym przypadku,
//        poza jak tego użyjemy bez nawiasó pojwią nam się dane z Animal
        Animal cat = new Animal() {
            @Override
            void makeVoice() {
                System.out.println("Meowwww");
            }
        };

        cat.makeVoice();
        Animal cat2 = new Animal();
        cat2.makeVoice();
        cat2.eat();
        cat.eat();
        System.out.println("-----------");
        Animal.Pet pet = cat.new Pet();
        pet.name = "Bear";
        pet.getName();
    }
}
