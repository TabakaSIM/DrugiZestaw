package pl.tabaka.bmi.core;

import pl.tabaka.bmi.GUI.Gui;
import pl.tabaka.bmi.constructor.User;

import java.util.Scanner;

public class UserMenu {
    private User user;

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
                    gui.showBmi(user.getBmi());
                    continue;
                case 3: //Wypisz dane
                    gui.showStats(user);
                    continue;
                case 4: //Usun konto (nie usuwa poki co :( )
                    return;
                default: //Wyjscie
                    return;
            }
        }
    }
}
