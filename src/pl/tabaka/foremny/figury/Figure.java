package pl.tabaka.foremny.figury;

import pl.tabaka.foremny.gui.GUI;

public class Figure {
    GUI gui = new GUI();
    public String nazwa;
    int[] boki;
    double obwod;

    public Figure() {
    }

    public Figure(int[] boki) {
        this.boki = boki;
        this.obliczObwod();
    }

    public Figure(int[] boki, String nazwa){
        this(boki);
        this.nazwa=nazwa;
    }

    protected void obliczObwod(){
        this.obwod=0;
        for (int bok:boki) {
            this.obwod+=bok;
        }
    }


    public void wypisz(int nr) {
        gui.nazwaFigury(this.nazwa);
        System.out.println("Boki tej figury " + (nr+1) + " to: ");
        for (int i=0;i<boki.length;i++){
            if(i!=0) {
                System.out.print(", ");
            }
            System.out.print(boki[i]);
        }
        System.out.println();
        gui.obwodFigury(this.obwod);
    }
}
