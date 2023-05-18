package pl.tabaka.sklep.core;

import pl.tabaka.foremny.core.Core;
import pl.tabaka.sklep.GUI.GUI;
import pl.tabaka.sklep.artykuly.ListaProduktow;
import pl.tabaka.sklep.artykuly.Produkt;
import pl.tabaka.sklep.users.User;
import pl.tabaka.sklep.users.UserList;

import java.util.Scanner;

public class CoreUserMenu {
    private final ListaProduktow listaProduktow = ListaProduktow.getInstance();
    private final UserList userlist = UserList.getInstance();
    private final GUI gui = GUI.getInstance();
    private static final CoreUserMenu instance = new CoreUserMenu();

    private CoreUserMenu() {
    }

    public void start(User user){
        if(user.isAdmin()){
            this.adminMenu(user);
        } else {
            this.userMenu(user);
        }
    }

    private void userMenu(User user){
        while(true){
            gui.showUserMenu(user);
            switch (new Scanner(System.in).next()){
                case "1":
                    listaProduktow.show(false);
                    continue;
                case "2":
                    listaProduktow.kup(user);
                    continue;
                case "3":
                    user.doladuj();
                    continue;
                case "4":
                    gui.showUserMenuLogout();
                    return;
                default:
                    gui.showMenuError();
                    continue;
            }
        }
    }

    private void adminMenu(User user){
        while(true){
            gui.showUserMenuAdmin(user);
            switch (new Scanner(System.in).next()){
                case "1":
                    listaProduktow.show(true);
                    continue;
                case "2":
                    listaProduktow.kup(user);
                    continue;
                case "3":
                    user.doladuj();
                    continue;
                case "4":
                    gui.showUserMenuLogout();
                    return;
                case "5":
                    listaProduktow.restock();
                    continue;
                case "6":
                    this.userlist.showUsers();
                    continue;
                case "7":
                    zmienRole();
                    continue;
                default:
                    gui.showMenuError();
                    continue;
            }
        }
    }

    private void zmienRole(){
        String name = gui.showZmianaRoli();
        if(!userlist.hasUser(name)){
            gui.showZmianaRoliError();
            return;
        }
        this.userlist.findUser(name).zmienRole();
        gui.showZmianaRoliSucces();
    }

    public static CoreUserMenu getInstance(){
        return instance;
    }
}
