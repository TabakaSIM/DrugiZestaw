package pl.tabaka.sklep.artykuly;

import pl.tabaka.sklep.GUI.GUI;

public class Produkt {
    String nazwa;
    float cena;
    int iloscNaStanie;

    public Produkt(String nazwa, float cena, int iloscNaStanie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaStanie = iloscNaStanie;
    }

    public boolean dostepny() {
        return this.iloscNaStanie>0;
    }

    public String getNazwa() {
        return nazwa;
    }

    public float getCena() {
        return cena;
    }

    public int getIloscNaStanie() {
        return iloscNaStanie;
    }

    public void restock(int dodaj) {
            this.iloscNaStanie+=dodaj;
            return;
    }
}
