package pl.com.kurs.lekcja27;

//interface posiada metody abstrakcyjne (abstract), jest ograniczony i nie będzie posiadał ciała metod
public interface Poruszanie {
    //    każda zmienna w interfejsie jest statycznia i finalna nie trzeba tego pisać
    String nazwaInterfejsu = "Poruszanie";

    void jedzDoPrzodu();

    void skrecaj();
}
