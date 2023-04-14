package pl.tabaka.bmi.core;


import pl.tabaka.bmi.data.UserData;
import pl.tabaka.bmi.GUI.Gui;

public class MainMenu {

    UserData users = new UserData();
    Gui gui = new Gui();



    public void start() {
        while (true) {
            switch (gui.showMenu()) {
                case 1: //Zaloguj sie
                    int ID=users.login(gui.login(), gui.password());
                    if(ID==-1) {
                        gui.loginError();//Błąd logowania!
                    }else{
                        new UserMenu(users.getFromID(ID)).start(gui);//Pomyślne zalogowanie, przejście do drugiego menu!
                    }
                    continue;
                case 2: //Utworz konto
                    gui.create();
                    users.createAccount();
                    continue;
                default: //Exit
                    return;

            }
        }
    }


}
