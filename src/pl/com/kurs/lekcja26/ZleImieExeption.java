package pl.com.kurs.lekcja26;

public class ZleImieExeption extends Exception {

    @Override
    public String getMessage() {
        return "Podano błędne imię";
    }
}
