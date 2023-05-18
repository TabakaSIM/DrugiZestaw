package pl.tabaka.dwudziestyMaja.FIFO;

import java.util.Scanner;

public class FIFOGUI {
    public Scanner scanner = new Scanner(System.in);


    public String mainInput() {
        System.out.println("1. Dodaj daną");
        System.out.println("2. Wyciągnij daną");
        System.out.println("3. Exit");
        return scanner.nextLine();
    }

    public String subMainInput() {
        System.out.println("1. Wyciągnij pierwsza z kolejki");
        System.out.println("2. Wyciągnij pierwsza z trzech o najwiekszym priorytecie");
        System.out.println("3. Wyciągnij o najwiekszym priorytecie");
        System.out.println("4. Exit");
        return scanner.nextLine();
    }

    public void error(){
        System.out.println("Niepoprawna liczba!");
    }


    public String podajStringa() {
        System.out.println("Podaj stringa:");
        return scanner.nextLine();
    }

    public int podajPriorytet() {
        System.out.println("Podaj priorytet");
        int priorytet = new Scanner(System.in).nextInt();
        if(priorytet<0 | priorytet>99){
            System.out.println("Podano zły priorytet (powinien byc pomiedzy 0, a 99!). Ustawiono na 0!");
            priorytet=0;
        }
        return priorytet;
    }

    public void errorBrakDanych() {
        System.out.println("W liscie nie ma stringow!");
    }

    public void show(FIFOEntry popFirst) {
        System.out.println("Wyciagnieto string: " + popFirst.getString());
    }
}
