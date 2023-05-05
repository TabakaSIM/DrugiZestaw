package pl.tabaka.sklep.core;

import pl.tabaka.sklep.GUI.GUI;
import pl.tabaka.sklep.artykuly.ListaProduktow;
import pl.tabaka.sklep.users.User;
import pl.tabaka.sklep.users.UserAdmin;
import pl.tabaka.sklep.users.UserList;

import java.util.Scanner;

public class CoreUserMenu {
    GUI gui = new GUI();
    ListaProduktow listaProduktow;

    public CoreUserMenu(User user, ListaProduktow listaProduktow, UserList userList) {
        this.listaProduktow=listaProduktow;
        while(true) {
            if(user instanceof UserAdmin){
                gui.showUserMenuAdmin(user);
                switch (new Scanner(System.in).next()){
                    case "1":
                        System.out.println("Zastepcze: Pokaz produkty, dla admina");
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
                        listaProduktow.Restock();
                        continue;
                    case "6":
                        userList.showUsers();
                        continue;
                    case "7":
                        userList.zmianaRoli();
                        continue;
                    default:
                        gui.showLogginMenuError();
                        continue;
                }
            }

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
                    gui.showLogginMenuError();
                    continue;
            }
        }
    }
}
