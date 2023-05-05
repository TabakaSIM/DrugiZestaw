package pl.tabaka.sklep.users;

import org.apache.commons.codec.digest.DigestUtils;
import pl.tabaka.bmi.GUI.Gui;
import pl.tabaka.sklep.GUI.GUI;

import java.awt.*;
import java.util.Scanner;

public class User {
    private String login;
    private static final String seed = "Ba7gPOCX3l4Kjd6PlgbT8^%XZGRia8LI";
    private String password;
    private float money;
    GUI gui = new GUI();

    public User(String login, String password) {
        this.login=login;
        this.password=DigestUtils.md5Hex(password+seed);
        this.money=0.00f;
    }

    public User(String login, String password, float money) {
        this.login = login;
        this.password = DigestUtils.md5Hex(password+seed);
        this.money = money;
    }

    public User(User user){
        this.login=user.login;
        this.password=user.password;
        this.money=user.money;
    }

    public boolean matchLogin(String login) {
        return this.login.equals(login);
    }

    public boolean matchPassword(String password) {
        return DigestUtils.md5Hex(password + seed).equals(this.password);
    }

    public String getLogin() {
        return login;
    }

    public float getMoney() {
        return money;
    }

    public void obciazRachunek(float koszt) {
        if(koszt<=this.money) {
            this.money -= koszt;
            gui.showZakupSucces();
            return;
        }
        gui.showZakupyMoneyError();
        return;
    }

    public void doladuj() {
        gui.showUserDoladowanie();
        this.dodajSrodki(new Scanner(System.in).nextInt());
    }

    private void dodajSrodki(float doladowanie){
        this.money+=doladowanie;
        gui.showUserPomyslneDoladowanie();
    }
}
