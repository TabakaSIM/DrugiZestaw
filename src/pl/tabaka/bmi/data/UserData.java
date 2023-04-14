package pl.tabaka.bmi.data;

import pl.tabaka.bmi.GUI.Gui;
import pl.tabaka.bmi.constructor.User;

public class UserData {
    private User[] users = new User[10];
    private Gui gui = new Gui();
    private int index = 3;

    public UserData(){
        this.users[0]= new User("Maciej1337","DobreByczki32", 70, 169);
        this.users[1]= new User("Kaziu123","PASSWORD", 90, 203);
        this.users[2]= new User("Tak","Nie", 55, 150);
        this.users[3]= new User("A3D5CC3","AngelAttack", 69, 189);
    }

    public int login(String login, String password){
        boolean match = false;
        for (int i=0;i<index+1;i++){
            if (users[i].match(login, password)) {
                return i;
            }
        }
        return -1;
    }
    public User getFromID(int ID){
        return this.users[ID];
    }

    public void createAccount(){
        if(this.index>=10) {
            System.out.println("Za duzo uzytkownikow!");
            return;
        }
        this.index++;
        this.users[this.index]=new User(gui.login(),gui.password());
    }
}