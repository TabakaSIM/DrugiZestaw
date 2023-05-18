package pl.tabaka.sklep.users;

import org.apache.commons.codec.digest.DigestUtils;
import pl.tabaka.sklep.GUI.GUI;
import pl.tabaka.sklep.artykuly.Produkt;
import pl.tabaka.sklep.core.Writable;

import java.util.Scanner;

public class User implements Writable {
    private String login;
    private String password;
    private static final String seed = "Ba7gPOCX3l4Kjd6PlgbT8^%XZGRia8LI";
    private float money;
    private boolean isAdmin=false;

    private final GUI gui = GUI.getInstance();

    public User(String login, String password, float money, boolean isAdmin) {
        this.login = login;
        this.password=password;
        //this.password = DigestUtils.md5Hex(password+seed);
        this.money = money;
        this.isAdmin=isAdmin;
    }

    public String getLogin() {
        return this.login;
    }

    public boolean matchPassword(String password){
        return this.password.equals(password);
        //return this.password.equals(DigestUtils.md5Hex(password+this.seed));
    }

    public void obciazRachunek(int ilosc, Produkt produkt) {
        System.out.println(ilosc* produkt.getCena());
        if(ilosc* produkt.getCena()<=this.money) {
            this.money -= ilosc* produkt.getCena();
            produkt.removeAmount(ilosc);
            gui.showZakupSucces();
            return;
        } else {
            gui.showZakupyMoneyError();
            return;
        }
    }

    public void doladuj() {
        this.dodajSrodki(gui.showUserDoladowanie());
    }

    public void dodajSrodki(float doladowanie){
        this.money+=doladowanie;
        gui.showUserPomyslneDoladowanie();
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

    public void zmienRole(){
        this.isAdmin=!isAdmin;
    }

    public float getMoney() {
        return money;
    }

    @Override
    public String toCSV(){
        return new StringBuilder().append(getClass().getSimpleName())
                .append(";")
                .append(this.login)
                .append(";")
                .append(this.password)
                .append(";")
                .append(this.money)
                .append(";")
                .append(this.isAdmin)
                .toString();
    }
}
