package pl.tabaka.bmi.core;

import pl.tabaka.bmi.GUI.Gui;
import pl.tabaka.bmi.constructor.User;

import java.util.Scanner;

public class UserMenu {
    Scanner scanner = new Scanner(System.in);
    User user;
    public UserMenu(User user) {
        this.user=user;
    }

    public void start(Gui gui){
        gui.loginMessage();
        while(true){
            switch (gui.showUserMenu()) {
                case 2: //Zaktualizuj dane
                    user.setBmi(gui.weight(),gui.height());
                case 1: //Sprawdz BMI
                    System.out.println("Twoje BMI to:"+ user.getBmi());
                    System.out.println();
                    continue;
                case 3: //Wypisz dane
                    System.out.println("Twoj wzrost to:"+ user.getWeight() +" cm");
                    System.out.println("Twoja waga to:"+ user.getHeight() + " kg");
                    System.out.println();
                    continue;
                case 4: //Usun konto
                    return;
                default: //Wyjscie
                    return;
            }
        }
    }
}
