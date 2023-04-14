package pl.tabaka.bmi.constructor;

import pl.tabaka.bmi.GUI.Gui;

public class User {
    private float bmi;
    private String login;
    private String password;
    private Gui gui = new Gui();

    private int w;
    private int h;

    public User(String login, String password){
    this.login=login;
    this.password=password;
    }

    public User(String login, String password, int w, int h) {
        this.login = login;
        this.password = password;
        this.w = w;
        this.h = h;
        this.bmi = (float) (w/Math.pow(h,2)*10000);
    }

    private User(int w, int h){
        this.w = w;
        this.h = h;
        this.bmi = (float) (w/Math.pow(h,2)*10000);
    }

    public boolean match(String login, String password){
        if(login.equals(this.login) && password.equals(this.password)){
            return true;
        }
        else return false;
    }


    public float getBmi() {
        return bmi;
    }

    public int getWeight(){
        return this.w;
    }

    public int getHeight(){
        return this.h;
    }

    public void setBmi(int w,int h){
        this.w = w;
        this.h = h;
        this.bmi = calcBMI(w,h);
    }

    private float calcBMI(int w,int h){
        return (float) (w/Math.pow(h,2)*10000);
    }

}
