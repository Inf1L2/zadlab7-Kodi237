package main.java.pl.edu.ur.oopl7.zad1;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String data_urodzenia;
    private char plec;

    public Osoba(String imie, String nazwisko, String data_urodzenia, char plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(String data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Osoba\n" + "imie: " + imie + "\n" + "nazwisko: " + nazwisko + "\n" + "data_urodzenia: " + data_urodzenia + "\n" + "plec: " + plec;
    }
}
