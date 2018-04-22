package main.java.pl.edu.ur.oopl7.zad1;

class Student extends Osoba {

    private int nr_indeksu;
    private String typ_studiow;
    private String kierunek;
    private  int rok_studiow;

    public Student(String imie, String nazwisko, String data_urodzenia, char plec, int nr_indeksu, String typ_studiow, String kierunek, int rok_studiow) {

        super(imie, nazwisko, data_urodzenia, plec);
        this.nr_indeksu = nr_indeksu;
        this.typ_studiow = typ_studiow;
        this.kierunek = kierunek;
        this.rok_studiow = rok_studiow;
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public String getTyp_studiow() {
        return typ_studiow;
    }

    public void setTyp_studiow(String typ_studiow) {
        this.typ_studiow = typ_studiow;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRok_studiow() {
        return rok_studiow;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }

    @Override
    public String toString() {
        return "Student\n" + super.toString() + "\nnr_indeksu: " + nr_indeksu + "\ntyp_studiow: " + typ_studiow + "\nkierunek: " + kierunek +"\nrok_studiow: " + rok_studiow;
    }
}
