package pl.tabaka.foremny.gui;

public class GUI {
    public GUI() {}

    public void wprowadzIlosc() {
        System.out.println("Wprowadz ilosc figur:");
    }

    public void koniecProgramu() {
        System.out.println();
        System.out.println("Koniec programu!");
    }

    public void zglosBlad() {
        System.out.println("Nieprawidlowa ilosc bokow! Zgloszono blad!");
    }

    public void zglosBlad(int nr) {
    System.out.println("Figura " +(nr+1) + " nie istnieje!");
    }

    public void nazwaFigury(String nazwa) {
        System.out.println("Podana figura to: " + nazwa);
    }

    public void obwodFigury(double obwod) {
        System.out.println("Obwod to: "+ obwod);
    }

    public void poleFigury(double pole) {
        System.out.println("Pole to: " + pole);
    }

    public void newLine() {
        System.out.println();
    }

    public void podajBoki(int i) {
        System.out.println("Wprowadz boki figury nr " + (i+1) + ":");
    }
}
