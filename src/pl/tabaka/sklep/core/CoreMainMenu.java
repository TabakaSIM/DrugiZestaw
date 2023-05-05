package pl.tabaka.sklep.core;

import pl.tabaka.sklep.GUI.GUI;
import pl.tabaka.sklep.artykuly.ListaProduktow;
import pl.tabaka.sklep.users.UserList;

import java.util.Scanner;

public class CoreMainMenu {
    GUI gui = new GUI();
    UserList userList = new UserList();
    public ListaProduktow listaProduktow = new ListaProduktow();

    public CoreMainMenu() {
        gui.showWelcomeMessage();
        while(true) {
            gui.showLogginMenu();
            switch (new Scanner(System.in).next()){
                case "1":
                    gui.showLogginMenuLogowanie();
                    userList.zaloguj(listaProduktow);
                    continue;
                case "2":
                    gui.showLogginMenuRejestracja();
                    userList.register();
                    continue;
                case "3":
                    gui.showExitMessage();
                    return;
                default:
                    gui.showLogginMenuError();
                    continue;
            }
        }
    }
}
