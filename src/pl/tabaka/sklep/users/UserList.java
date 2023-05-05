package pl.tabaka.sklep.users;

import pl.tabaka.sklep.GUI.GUI;
import pl.tabaka.sklep.artykuly.ListaProduktow;
import pl.tabaka.sklep.core.CoreUserMenu;

import java.util.Scanner;

public class UserList {
    GUI gui = new GUI();
    User[] userList;
    int index=0;

    public UserList() {
        this.userList  = new User[10];
        this.register("admin","admin", 10000.00f);
    }

    private void register(String login, String password, float money) {
        userList[index]= new UserAdmin(login, password, money);
        index++;
    }

    public void register(){
        if(index==10){
            gui.showRegisterErrorOutOfIndex();
            return;
        }
        gui.showRegisterPodajLoggin();
        String login=new Scanner(System.in).nextLine();
        for(int i=0;i<index;i++){
            if(userList[i].matchLogin(login)){
                gui.showRegisterError();
                return;
            }
        }
        gui.showRegisterPodajHaslo();
        userList[index]= new User(login, new Scanner(System.in).nextLine());
        index++;
        gui.showRegisterSucces();
    }

    public void zaloguj(ListaProduktow listaProduktow) {
        gui.showPodajLoggin();
        String login = new Scanner(System.in).nextLine();
        gui.showPodajHaslo();
        String password = new Scanner(System.in).nextLine();
        int findIndex=-1;
        for(int i=0;i<index;i++){
            if(userList[i].matchLogin(login)&userList[i].matchPassword(password)){
                findIndex=i;
            }
        }
        if(findIndex==-1){
            gui.showLogginError();
            return;
        }
        gui.showLogginSucces();
        new CoreUserMenu(userList[findIndex],listaProduktow, this);
    }

    public void showUsers(){
        for (User user:userList) {
            if(user!=null){
            gui.showUser(user);
            }
        }
    }

    public void zmianaRoli() {
        showUsers();
        gui.showZmianaRoli();
        String find = new Scanner(System.in).nextLine();
        int indexFind=-1;
        xd: for(int i=0;i<this.index;i++){
           if(userList[i].getLogin().equals(find)){
               indexFind=i;
               break xd;
           }
        }
        if(indexFind==-1) {
            gui.showZmianaRoliError();
            return;
        }
        if(userList[indexFind] instanceof User) {
            userList[indexFind] = new UserAdmin(userList[indexFind]);
        }else {
            userList[indexFind] = new User(userList[indexFind]);
        }
        gui.showZmianaRoliSucces();
        return;
    }
}
