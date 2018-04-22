package main.java.pl.edu.ur.oopl7.zad1;

class Wykladowca extends Osoba {

    private String tytul;
    private String katedra;
    private String przedmiot;

    public Wykladowca (String imie, String nazwisko, String data_urodzenia, char plec, String tytul, String katedra, String przedmiot){
        super(imie,nazwisko,data_urodzenia,plec);
        this.tytul = tytul;
        this.katedra = katedra;
        this.przedmiot = przedmiot;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getKatedra() {
        return katedra;
    }

    public void setKatedra(String katedra) {
        this.katedra = katedra;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Wykladowca\n" + super.toString() + "\ntytul: " + tytul + "\nkatedra: " + katedra + "\nprzedmiot: " + przedmiot;
    }
}
