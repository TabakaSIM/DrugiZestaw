package pl.tabaka.sklep.core;

import pl.tabaka.sklep.GUI.GUI;
import pl.tabaka.sklep.artykuly.ListaProduktow;
import pl.tabaka.sklep.artykuly.Produkt;
import pl.tabaka.sklep.users.User;
import pl.tabaka.sklep.users.UserList;

import java.io.IOException;

public class CoreMainMenu {
    private final GUI gui = GUI.getInstance();
    private final ListaProduktow listaProduktow = ListaProduktow.getInstance();
    private final UserList userList = UserList.getInstance();
    private final Loader loader = Loader.getInstance();

    public CoreMainMenu() {
        try {
            loader.readDataFromFile();
        } catch (IOException e) {
            System.out.println("Database is malformed !!");
            return;
        }
        gui.showWelcomeMessage();
        while(true) {
            switch (gui.showLogginMenu()){
                case "1":
                    gui.showLogginMenuLogowanie();
                    zaloguj();
                    continue;
                case "2":
                    gui.showLogginMenuRejestracja();
                    userList.register(new User(gui.showPodajLoggin(),gui.showPodajHaslo(), 0.0f,false),false);
                    continue;
                case "3":
                    gui.showExitMessage();
                    try {
                        loader.saveDataToFile();
                        return;
                    } catch (IOException e) {
                        System.out.println("Database Error !!");
                    }
                default:
                    gui.showMenuError();
                    continue;
            }
        }
    }

    private void zaloguj(){
        int counter=0;
        while (counter<3){
            counter++;
            User user = userList.findUser(gui.showPodajLoggin());
            String password = gui.showPodajHaslo();
            if(user!=null){
                if(user.matchPassword(password)) {
                    gui.showLogginSucces();
                    CoreUserMenu.getInstance().start(user);
                    return;
                }
            }
            gui.showLogginError();
        }
        gui.showWyjscieDoMenu();
        return;
    }
}
