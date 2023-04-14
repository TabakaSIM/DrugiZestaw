package pl.tabaka.bmi.GUI;

import java.util.Scanner;

public class Gui {
    Scanner scanner = new Scanner(System.in);

    public int showMenu(){
        System.out.println("Wpisz funkcje programu:");
        System.out.println("1.Zaloguj sie");
        System.out.println("2.Utworz konto");
        System.out.println("3.Exit");
        System.out.println();
        return scanner.nextInt();
    }

    public int showUserMenu(){
        System.out.println("Wybierz dalsza funkcje:");
        System.out.println("1.Sprawdz BMI");
        System.out.println("2.Zaktualizuj dane");
        System.out.println("3.Przypomnij moje dane");
        System.out.println("4.Usun konto (nie dziala)");
        System.out.println("5.Wyloguj");
        System.out.println();
        return scanner.nextInt();
    }

    public String login(){
        System.out.println("Wprowadz login");
        return scanner.next();
    }

    public String password(){
        System.out.println("Wprowadz haslo");
        return scanner.next();
    }

    public void loginMessage(){
        System.out.print("Pomyslnie zalogowano!");
    }

    public void loginError(){
        System.out.println("Login lub haslo niepoprawne!");
    }

    public int weight(){
        System.out.println("Wprowadz wage (w kg)");
        return scanner.nextInt();
    }

    public int height(){
        System.out.println("Wprowadz wysokosc (w cm)");
        return scanner.nextInt();
    }

    public void create(){

    }
}
